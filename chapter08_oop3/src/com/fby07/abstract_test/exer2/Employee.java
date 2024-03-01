package com.fby07.abstract_test.exer2;

/**
 * ClassName: Employee
 * Package: com.fby07.abstract_test.exer2
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/10/24 - 2:21
 * @Version: V0.1
 */
public abstract class Employee {
    private String name;
    private int number;
    private MyDate birthday;

    public Employee() {
    }

    public Employee(String name, int number, MyDate birthday) {
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public abstract double earnings();

    @Override
    public String toString() {
        return "name=" + name + ", number=" + number +
                ", birthday=" + birthday.toDateString();
    }
}
