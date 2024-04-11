package com.fby.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * ClassName: ListTest
 * Package: com.fby.list
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2024/4/1 - 5:30
 * @Version: V0.1
 */
public class ListTest {
    @Test
    public void test1(){
        ArrayList<String> list = new ArrayList<>();
        list.add("AA");
        list.add("BB");
    }

    @Test
    public void test3(){
        LinkedList<String> list = new LinkedList<>();
        list.add("AA");
        list.add("BB");
    }
}
