package com.fby.list.exer2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * ClassName: ListTest
 * Package: com.fby.list.exer2
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/12/18 - 2:16
 * @Version: V0.1
 */
public class ListTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 30; i++) {
            String s = (char) (Math.random() * (122 - 97 + 1) + 97) + "";
            list.add(s);
        }
        System.out.println(list);

        int aCount = listTest(list, "a");
        int bCount = listTest(list, "b");
        int cCount = listTest(list, "c");
        int xCount = listTest(list, "x");

        System.out.println("a" + aCount);
        System.out.println("b" + bCount);
        System.out.println("c" + cCount);
        System.out.println("x" + xCount);
    }

    public static int listTest(Collection list, String s) {
        int count = 0;
        for (Object obj : list) {
            if (s.equals(obj)) {
                count++;
            }
        }
        return count;
    }
}
