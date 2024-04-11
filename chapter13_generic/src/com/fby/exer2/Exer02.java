package com.fby.exer2;

import org.junit.Test;

import java.util.Arrays;

/**
 * ClassName: Exer02
 * Package: com.fby.exer2
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2024/3/22 - 10:19
 * @Version: V0.1
 */
public class Exer02 {
    public static <E> void method1(E[] e, int a, int b){
        E temp = e[a];
        e[a] = e[b];
        e[b] = temp;
    }

    @Test
    public void test1(){
        String[] arr = new String[]{"AA", "B2", "C3"};
        System.out.println(Arrays.toString(arr));
        method1(arr,0,1);
        System.out.println(Arrays.toString(arr));
    }

    public static <E> void method2(E[] e){
        for (int i = 0, j = e.length -1; i < j; i++, j--) {
            E temp = e[i];
            e[i] = e[j];
            e[j] = temp;
        }
    }

    @Test
    public void test2(){
        String[] arr = new String[]{"AA", "B2", "C3", "D4"};
        System.out.println(Arrays.toString(arr));
        method2(arr);
        System.out.println(Arrays.toString(arr));
    }
}
