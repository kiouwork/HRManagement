package com.fby.map.exer1;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/**
 * ClassName: TreeMapTest
 * Package: com.fby.map.exer1
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2024/2/1 - 2:15
 * @Version: V0.1
 */
public class TreeMapTest {
    @Test
    public void test1(){
        TreeMap treeMap = new TreeMap();
        treeMap.put("AA",90);
        treeMap.put("BB",80);
        treeMap.put("CC",70);
        treeMap.put("DD",60);
        treeMap.put("EE",50);

        //自然排序
        Set entrySet = treeMap.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (Object obj :entrySet){
            System.out.println(obj);
        }
        
        //自定义排序
        
    }
    @Test
    public void test2(){
        TreeMap map = new TreeMap();

        User u1 = new User("Tom", 23);
        User u2 = new User("Jerry", 43);
        User u3 = new User("Rose", 13);
        User u4 = new User("Jack", 23);
        User u5 = new User("Tony", 33);
        User u6 = new User("tree", 26);

        map.put(u1,110);
        map.put(u2,100);
        map.put(u3,90);
        map.put(u4,80);
        map.put(u5,70);
        map.put(u6,60);

        Set entrySet = map.entrySet();
        for(Object obj : entrySet){
            System.out.println(obj);
        }
    }

    @Test
    public void test3(){
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
              if(o1 instanceof User && o2 instanceof User){
                  User u1 = (User) o1;
                  User u2 = (User) o2;
                  int value = u1.getName().compareTo(u2.getName());
                  if(value != 0){
                      return value;
                  }
                  return u1.getAge() - u2.getAge();
              }
              throw new RuntimeException("类型不匹配!");
            }
        };
        TreeMap map = new TreeMap(comparator);

        User u1 = new User("Tom", 23);
        User u2 = new User("Jerry", 43);
        User u3 = new User("Rose", 13);
        User u4 = new User("Jack", 23);
        User u5 = new User("Tony", 33);
        User u6 = new User("tree", 26);

        map.put(u1,110);
        map.put(u2,100);
        map.put(u3,90);
        map.put(u4,80);
        map.put(u5,70);
        map.put(u6,60);

        Set entrySet = map.entrySet();
        for(Object obj : entrySet){
            System.out.println(obj);
        }
    }
}
