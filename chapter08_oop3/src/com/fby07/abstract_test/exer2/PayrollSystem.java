package com.fby07.abstract_test.exer2;

import java.util.Scanner;

/**
 * ClassName: PayrollSystem
 * Package: com.fby07.abstract_test.exer2
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/10/24 - 3:18
 * @Version: V0.1
 */
public class PayrollSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Employee[] emps = new Employee[2];
        emps[0] = new SalariedEmployee("张三",1001,new MyDate(1992,10,2),11000);
        emps[1] = new HourlyEmployee("李四",1002,new MyDate(1980,11,11),5000,20);

        System.out.print("请输入月份：");
        int month = scan.nextInt();

        for(int i = 0 ; i < emps.length; i++){
            System.out.println(emps[i].toString());
            System.out.println("工资是：" + emps[i].earnings());

            if(month == emps[i].getBirthday().getMonth()){
                System.out.println("heppy birthday，earning up 100！");
            }
        }
        scan.close();
    }
}
