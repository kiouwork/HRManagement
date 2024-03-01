package com.fby08._interface;

/**
 * ClassName: FinallyTest
 * Package: com.fby08._interface
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/10/31 - 23:40
 * @Version: V0.1
 */
public class FinallyTest {
    public static void main(String[] args) {
        int result = test(10);
        System.out.println(result);
    }

    public static int test(int num){
        try {
            return num;
        }catch (NumberFormatException e){
            return num--;
        }finally {
            System.out.println("test over!");
            return ++num;
        }
    }
}