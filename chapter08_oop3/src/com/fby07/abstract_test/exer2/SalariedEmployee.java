package com.fby07.abstract_test.exer2;

/**
 * ClassName: SalariedEmployee
 * Package: com.fby07.abstract_test.exer2
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/10/24 - 2:35
 * @Version: V0.1
 */
public class SalariedEmployee extends Employee{
    private double monthlySalary;

    public SalariedEmployee() {
    }

    @Override
    public double earnings() {
        return monthlySalary;
    }

    public SalariedEmployee(String name, int number, MyDate birthday, double monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee[" + super.toString() + "]";
    }
}
