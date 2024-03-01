package com.fby07.abstract_test.exer2;

/**
 * ClassName: MyDate
 * Package: com.fby07.abstract_test.exer2
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/10/24 - 2:22
 * @Version: V0.1
 */
public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String toDateString() {
        return "" + year +
                "年" + month +
                "月" + day +
                "日";
    }
}
