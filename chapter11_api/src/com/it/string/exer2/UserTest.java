package com.it.string.exer2;

import java.util.Scanner;

/**
 * ClassName: UserTest
 * Package: com.it.string.exer2
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/11/23 - 22:16
 * @Version: V0.1
 */
public class UserTest {
    public static void main(String[] args) {
        //创建数组，并初始化几个User对象；
        User[] arr = new User[3];
        arr[0] = new User("songhk", "123");
        arr[1] = new User("Tom", "8888");
        arr[2] = new User("Jerry", "6666");

        System.out.println("库中的用户有：");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //实例化Scanner，获取输入的用户名和密码
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String userName = scan.next();
        System.out.print("请输入密码：");
        String password = scan.next();

        //遍历数组，匹配用户名和密码
        boolean isFlay = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getName().equals(userName)) {
                isFlay = false;
                if (arr[i].getPassword().equals(password)) {
                    System.out.println("登录成功，" + userName);
                    break;
                } else {
                    System.out.println("密码错误");
                    break;
                }
            }
        }
        if (isFlay) {
            System.out.println("没有该用户");
        }
        boolean isname = false;
        boolean ispass = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getName().equals(userName)) {
                isname = true;
            }
            if (ispass = arr[i].getPassword().equals(password)) {
                ispass = true;
            }
            if (isname && ispass) {
                System.out.println("登录成功，" + userName);
                break;
            } else if (isname) {
                System.out.println("输入的密码错误");
                break;
            }
        }
        if (!isname) {
            System.out.println("没有该用户");
        }
        scan.close();
    }
}
