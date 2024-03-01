package com.fby07.abstract_test;

/**
 * ClassName: Student
 * Package: com.fby07.abstract_test
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/10/23 - 22:38
 * @Version: V0.1
 */
public class Student extends Person{
    String school;

    public Student() {
    }

    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    public void eat(){
        System.out.println("学生吃好饭");
    }
    public void sleep(){
        System.out.println("学生睡8小时");
    }
}
