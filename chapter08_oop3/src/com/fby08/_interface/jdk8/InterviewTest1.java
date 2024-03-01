package com.fby08._interface.jdk8;


import org.junit.Test;

/**
 * ClassName: InterviewTest1
 * Package: com.fby08._interface.jdk8
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/10/27 - 23:12
 * @Version: V0.1
 */
public class InterviewTest1 {
    public static void main(String[] args) {
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);

        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n);

        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);
    }
    @Test
    public void aab(){
        System.out.println("===========");
        Integer i1 = 1000;
        double b1 = 1000;
        System.out.println(i1 == b1);

    }
    @Test
    public void test11(){
        System.out.println("111");
    }
}