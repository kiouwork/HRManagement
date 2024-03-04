package com.fby.map.exer2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * ClassName: CityMapTest
 * Package: com.fby.map.exer2
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2024/3/1 - 9:52
 * @Version: V0.1
 */
public class CityMapTest {
    public static void main(String[] args) {
        Map map = CityMap.model;
        Set provinces = map.keySet();

        for(Object obj : provinces){
            System.out.print(obj + "\t\t");
        }
        //数组存储城市
        String[] cities;
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("请输入省份：");
            String province = scanner.next();

            cities = (String[]) map.get(province);

            if(cities == null || cities.length == 0){
                System.out.println("输入错误，请重新输入：");
            }else {
                for (int i = 0; i < cities.length; i++) {
                    System.out.print(cities[i] + "\t\t");
                }
                break;
            }
        }

        l:while (true){
            System.out.println("请输入城市：");
            String city = scanner.next();
            for (int i = 0; i < cities.length; i++) {
                if(city.equals(cities[i])){
                    System.out.println("录入成功！");
                    break l;
                }
            }
            System.out.println("没有这个城市，请重新输入：");
        }
    }
}
class CityMap{

    public static Map model = new HashMap();

    static {
        model.put("北京", new String[] {"北京"});
        model.put("上海", new String[] {"上海"});
        model.put("天津", new String[] {"天津"});
        model.put("重庆", new String[] {"重庆"});
        model.put("黑龙江", new String[] {"哈尔滨","齐齐哈尔","牡丹江","大庆","伊春","双鸭山","绥化"});
        model.put("吉林", new String[] {"长春","延边","吉林","白山","白城","四平","松原"});
        model.put("河北", new String[] {"石家庄","张家口","邯郸","邢台","唐山","保定","秦皇岛"});
    }

}