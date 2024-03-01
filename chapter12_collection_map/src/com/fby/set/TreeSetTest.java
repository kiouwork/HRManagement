package com.fby.set;

import org.junit.Test;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * ClassName: TreeSetTest
 * Package: com.fby.set
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2024/1/23 - 19:40
 * @Version: V0.1
 */
public class TreeSetTest {
    @Test
    public void test1(){
        TreeSet set = new TreeSet();
        set.add("AA");
        set.add("bb");
        set.add("cc");
        set.add("gg");
        set.add("dd");
        set.add("ab");
        set.add("Aac");

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test2(){
        TreeSet set = new TreeSet();

        User u1 = new User("Tom", 23);
        User u2 = new User("Jerry", 43);
        User u3 = new User("Rose", 13);
        User u4 = new User("Jack", 23);
        User u5 = new User("Tony", 33);
        User u6 = new User("tree", 26);

        set.add(u1);
        set.add(u2);
        set.add(u3);
        set.add(u4);
        set.add(u5);
        set.add(u6);

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
