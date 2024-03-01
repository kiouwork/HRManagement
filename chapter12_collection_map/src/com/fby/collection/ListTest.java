package com.fby.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * ClassName: ListTest
 * Package: com.fby.collection
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/12/8 - 2:16
 * @Version: V0.1
 */
public class ListTest {
    @Test
    public void test() {
        List list = new ArrayList();
        list.add("AA");
        list.add(123);
        list.add("BB");
        list.add(new Person("Tom", 12));
        System.out.println(list);
        list.add(2, "CC");

        //addAll
        List list1 = Arrays.asList(1, 2, 3);

        list.addAll(1, list1);
//        list.add(1,list1);
        System.out.println(list);
    }

    @Test
    public void test2() {
        List list = new ArrayList();
        list.add("AA");
        list.add("BB");
        list.add("CC");
        list.add(123);
        list.add(2);
        list.add(new Person("Tom", 12));
        System.out.println(list);
        list.remove(2);
        System.out.println(list);

        System.out.println(list.get(2));

        list.remove(Integer.valueOf(2));
        System.out.println(list);
    }

    @Test
    public void test3(){
        List list = new ArrayList();
        list.add("AA");
        list.add("BB");
        list.add("CC");
        list.add(123);
        list.add(2);
        list.add(new Person("Tom", 12));

        //遍历方式1：使用迭代器
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (Object obj : list){
            System.out.println(obj);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}