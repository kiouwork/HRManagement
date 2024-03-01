package com.fby.set;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * ClassName: setTest
 * Package: com.fby.set
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2024/1/7 - 21:56
 * @Version: V0.1
 */
public class setTest {
    @Test
    public void test1(){
        Set set = new HashSet();

        set.add("AA");
        set.add(123);
        set.add("bb");
        set.add("cc");
        set.add(new Person("tom",12));

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
