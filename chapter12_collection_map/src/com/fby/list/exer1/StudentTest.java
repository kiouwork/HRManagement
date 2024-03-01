package com.fby.list.exer1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ClassName: StudentTest
 * Package: com.fby.list.exer1
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/12/17 - 20:52
 * @Version: V0.1
 */
public class StudentTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List list = new ArrayList();

        System.out.println("请输入学生信息：");
        while (true){
            System.out.println("1:继续录入； 0、结束录入");
            int selection = scan.nextInt();
            if (selection == 0){
                break;
            }
            if (selection == 1){
                System.out.print("请输入学生姓名：");
                String name = scan.next();
                System.out.print("请输入学生年龄：");
                int age = scan.nextInt();

                Student stud = new Student(name,age);

                list.add(stud);
            }else {
                System.out.println("输入有误：");
            }
        }
        System.out.println("遍历学生信息：");
        for(Object s : list){
            System.out.println(s.toString());
        }
        scan.close();
    }
}
