package com.fby07.abstract_test.exer2;

/**
 * ClassName: HourlyEmployee
 * Package: com.fby07.abstract_test.exer2
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/10/24 - 3:09
 * @Version: V0.1
 */
public class HourlyEmployee extends Employee {
    private double wage;
    private int hour;

    public HourlyEmployee() {
    }

    @Override
    public double earnings() {
        return wage * hour;
    }

    public HourlyEmployee(String name, int number, MyDate birthday, double wage, int hour) {
        super(name, number, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
    @Override
    public String toString() {
        return "SalariedEmployee{" + super.toString() + "}";
    }
}
