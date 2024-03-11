package com.fby.generic01.exer1;

/**
 * ClassName: MyDate
 * Package: com.fby.generic01.exer1
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2024/3/6 - 11:13
 * @Version: V0.1
 */
public class MyDate implements Comparable<MyDate> {
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

    @Override
    public String toString() {
        return year + "年" + month + "月" + day + "日";
    }

    @Override
    public int compareTo(MyDate o) {
        int yearDistince = this.getYear() - o.getYear();
        if (yearDistince != 0) {
            return yearDistince;
        }
        int monthDistince = this.getMonth() - o.getMonth();
        if(monthDistince != 0){
            return monthDistince;
        }
        return this.getDay() - o.getDay();
    }
}
