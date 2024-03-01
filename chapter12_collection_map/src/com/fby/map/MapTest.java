package com.fby.map;

import com.fby.set.Person;
import org.junit.Test;

import java.util.*;

/**
 * ClassName: MapTest
 * Package: com.fby.map
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2024/1/31 - 3:49
 * @Version: V0.1
 */
public class MapTest {
    @Test
    public void test1(){
        Map map = new HashMap();

        map.put(null,null);

        System.out.println(map);
    }

    @Test
    public void test4(){
        HashMap map = new HashMap();

        //添加
        map.put("AA",11);
        map.put(22,"BB");
        map.put("BB",33);
        map.put(new Person("java",55),55);

        System.out.println(map);
        System.out.println("=======");
        System.out.println(map.size());

        //移除
        Object value = map.remove("AA");
        System.out.println(value);
        System.out.println(map);

        //修改
        Object oldValue = map.put(22,"new");
        System.out.println(oldValue);
        System.out.println(map);

        //查
        Object value1 = map.get(22);
        System.out.println(value1);
    }

    @Test
    public void test5(){
        HashMap map = new HashMap();

        //添加
        map.put("AA",11);
        map.put(22,"BB");
        map.put("BB",33);
        map.put(new Person("java",55),55);

        //遍历key集
        Set keySet = map.keySet();
        //使用迭代器
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //遍历values,方法1：
        Collection values = map.values();
        for(Object obj : values){
            System.out.println(obj);
        }
        //遍历values，方法2：
        Set keySet1 = map.keySet();
        for (Object key : keySet1){
            System.out.println(map.get(key));
        }
    }
    @Test
    public void test6(){
        HashMap map = new HashMap();
        map.put("A",1);
        map.put("B",2);
        map.put("C",3);
        map.put("D",4);
        map.put("A10",10);

        //entry集，方式1：
        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()){
            //方法1：
//            System.out.println(iterator.next());
            //方法2：自定义对应符
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey() + "------->" + entry.getValue());
        }
        //entry集，方式2：
        Set keySet = map.keySet();
        for (Object key : keySet){
            System.out.println(key + "======>" + map.get(key));
        }
    }
}
