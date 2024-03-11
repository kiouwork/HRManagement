package com.fby.generic01.exer2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

/**
 * ClassName: Exer2
 * Package: com.fby.generic01.exer2
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2024/3/8 - 10:24
 * @Version: V0.1
 */
public class Exer2 {
    public static void main(String[] args) {
        //创建整数泛型的集合
        ArrayList<Integer> integers = new ArrayList<>();
        //随机【0，100）的整数添加进集合
        for (int i = 0; i < 5; i++) {
            int temp = (int) (Math.random() * (99 -0 +1));
            integers.add(temp);
        }
        //使用增强for循环，遍历集合内容
        for(Integer in :integers){
            System.out.print(in + "\t");
        }
        System.out.println();
        //删除集合中的偶数
        integers.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        });
        //使用integer泛型迭代器，遍历集合剩下的数。
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()){
            Integer value = iterator.next();
            System.out.print(value + "\t");
        }
    }
}
