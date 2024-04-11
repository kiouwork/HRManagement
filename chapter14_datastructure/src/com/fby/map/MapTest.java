package com.fby.map;

import org.junit.Test;

import java.util.HashMap;

/**
 * ClassName: MapTest
 * Package: com.fby.map
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2024/4/3 - 5:18
 * @Version: V0.1
 */
public class MapTest {
    @Test
    public void test1(){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("AA", 78);
        map.put("BB", 88);
    }

    @Test
    public void test2(){
        int h = 178;
        int l = 15;
        System.out.println(h & l);
    }
}
