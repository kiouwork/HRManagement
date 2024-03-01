package com.it.string;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

/**
 * ClassName: StringMethodTest
 * Package: com.it.string
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/11/21 - 21:37
 * @Version: V0.1
 */
public class StringMethodTest {
    @Test
    public void test1() throws UnsupportedEncodingException {
        //string --> byte
        String str = new String("abc中国");
        byte[] arr = str.getBytes();
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println();
        byte[] arr1 = str.getBytes("gbk");
        for (int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i]);
        }
        //byte -->string
        String str1 = new String(arr);
        System.out.println(str1);

        String str2 = new String(arr1);
        System.out.println(str2);

        String str3 = new String(arr1,"gbk");
        System.out.println(str3);

    }

}
