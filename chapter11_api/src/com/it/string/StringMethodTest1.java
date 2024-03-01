package com.it.string;

import org.junit.Test;

/**
 * ClassName: StringMethodTest1
 * Package: com.it.string
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/11/22 - 2:04
 * @Version: V0.1
 */
public class StringMethodTest1 {
    @Test
    public void test1(){
        String s1 = "";
        String s2 = new String();
        String s3 = new String("");

        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());
        System.out.println(s3.isEmpty());
    }

    @Test
    public void test2(){
        String s1 = "hello";
        String s2 = "HellO";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
    }

    @Test
    public void test3(){
        String s1 = "诸城市妇幼保健院";
        System.out.println(s1.substring(3));
        System.out.println(s1.substring(3, 5));
    }

    @Test
    public void test4(){
        String s1 = "诸城市妇幼保健院";
        System.out.println(s1.charAt(2));

        String s2 = String.valueOf(new char[]{'a','b','c'});
        String s3 = String.copyValueOf(new char[]{'a', 'b', 'c'});
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s2 == s3);
    }
}
