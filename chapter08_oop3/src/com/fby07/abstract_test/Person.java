package com.fby07.abstract_test;

/**
 * ClassName: Person
 * Package: com.fby07.abstract_test
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/10/23 - 22:36
 * @Version: V0.1
 */
public abstract class Person {
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void eat();
    public void sleep(){
        System.out.println("人睡觉");
    }
}
