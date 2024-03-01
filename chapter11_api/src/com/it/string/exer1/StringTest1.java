package com.it.string.exer1;

import org.junit.Test;

/**
 * ClassName: StringTest1
 * Package: com.it.string.exer1
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/11/23 - 1:58
 * @Version: V0.1
 */
public class StringTest1 {
    @Test
    public void test(){
        String s1 = "abcdefg";
        String s2 = reverse(s1, 2, 5);
        System.out.println(s1);
    }
    //将string --》char
    public String reverse(String str, int fromIndex, int toIndex) {
        char[] arr = str.toCharArray();
        for (int i = fromIndex, j = toIndex ; i < j; i++, j--) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return new String(arr);
    }
}
