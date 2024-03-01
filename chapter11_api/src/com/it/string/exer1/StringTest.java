package com.it.string.exer1;

import org.junit.Test;

/**
 * ClassName: StringTest
 * Package: com.it.string.exer1
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/11/22 - 21:56
 * @Version: V0.1
 */
public class StringTest {
    String str = "test";
    public String s22 = "";
    char[] ch = {'t', 'e', 's', 't'};

    public static void main(String[] args) {
        String s1 = "hel";
        s1 = "1";
        System.out.println(s1);
        StringTest ex = new StringTest();
        ex.change(ex.str, ex.ch);
        System.out.println(ex.str);
        System.out.println(ex.ch);
    }

    public void change(String str, char[] ch) {
        str = "test ok";
        ch[0] = 'b';
    }

    @Test
    public void test() {
        String s1 = "abcdefg";
        String s2 = reverse(s1, 2, 5);
        System.out.println(s1);
    }

    //将string --》char
    public String reverse(String str, int fromIndex, int toIndex) {
        char[] arr = str.toCharArray();
        for (int i = fromIndex, j = toIndex; i < j; i++, j--) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return new String(arr);
    }

    @Test
    public void test5() {
        String s = "bbbbbabkkcadkabkebfkabkskabaaaa";
        String s1 = "ab";
        System.out.println(getSubStringCount(s, s1));
    }

    public int getSubStringCount(String str, String subStr) {
        int count = 0;
        if (str.length() >= subStr.length()) {
            for (int i = 0; i < str.length(); i += subStr.length()) {
                i = str.indexOf(subStr, i);
                System.out.println(i);
                if (i >= 0) {
                    count++;
                } else {
                    System.out.println("else runing");
                    break;
                }
            }
        }
        return count;
    }
}