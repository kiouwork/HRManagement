package com.fby.generic01.exer1;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * ClassName: EmployeeTest
 * Package: com.fby.generic01.exer1
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2024/3/6 - 11:12
 * @Version: V0.1
 */
public class EmployeeTest {
    @Test
    public void test1(){
        TreeSet<Employee> treeSet = new TreeSet<>();
        Employee e1 = new Employee("zhangsan",18,new MyDate(2006,1,1));
        Employee e2 = new Employee("lisi",19,new MyDate(2005,2,2));
        Employee e3 = new Employee("wangwu",20,new MyDate(2004,3,3));
        Employee e4 = new Employee("qianqi",21,new MyDate(2003,4,4));
        Employee e5 = new Employee("sunba",22,new MyDate(2002,5,5));

        treeSet.add(e1);
        treeSet.add(e2);
        treeSet.add(e3);
        treeSet.add(e4);
        treeSet.add(e5);

        Iterator<Employee> iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test2() {
        Comparator<Employee> comparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                int yearDistince = o1.getBirthday().getYear() - o2.getBirthday().getYear();
                if (yearDistince != 0) {
                    return yearDistince;
                }
                int monthDistince = o1.getBirthday().getMonth() - o2.getBirthday().getMonth();
                if(monthDistince != 0){
                    return monthDistince;
                }
                int dayDistince = o1.getBirthday().getDay() - o2.getBirthday().getDay();
                if(dayDistince != 0){
                    return dayDistince;
                }
                return 0;
            }
        };
        TreeSet<Employee> treeSet = new TreeSet<>(comparator);
        Employee e1 = new Employee("zhangsan", 18, new MyDate(2006, 1, 1));
        Employee e2 = new Employee("lisi", 19, new MyDate(2005, 2, 2));
        Employee e5 = new Employee("sunba", 22, new MyDate(2002, 5, 5));
        Employee e3 = new Employee("wangwu", 20, new MyDate(2004, 3, 3));
        Employee e4 = new Employee("qianqi", 21, new MyDate(2003, 4, 4));
        Employee e6 = new Employee("sunba", 22, new MyDate(2002, 5, 5));

        treeSet.add(e1);
        treeSet.add(e2);
        treeSet.add(e3);
        treeSet.add(e4);
        treeSet.add(e5);
        treeSet.add(e6);

        Iterator<Employee> iterator = treeSet.iterator();
        while (iterator.hasNext()){
            Employee employee = iterator.next();
            System.out.println(employee);
        }
    }

    @Test
    public void test3() {
        Comparator<Employee> comparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getBirthday().compareTo(o2.getBirthday());
            }
        };
        TreeSet<Employee> treeSet = new TreeSet<>(comparator);
        Employee e1 = new Employee("zhangsan", 18, new MyDate(2006, 1, 1));
        Employee e2 = new Employee("lisi", 19, new MyDate(2005, 2, 2));
        Employee e5 = new Employee("sunba", 22, new MyDate(2002, 5, 5));
        Employee e3 = new Employee("wangwu", 20, new MyDate(2004, 3, 3));
        Employee e4 = new Employee("qianqi", 21, new MyDate(2003, 4, 4));
        Employee e6 = new Employee("sunba", 22, new MyDate(2002, 5, 5));

        treeSet.add(e1);
        treeSet.add(e2);
        treeSet.add(e3);
        treeSet.add(e4);
        treeSet.add(e5);
        treeSet.add(e6);

        Iterator<Employee> iterator = treeSet.iterator();
        while (iterator.hasNext()){
            Employee employee = iterator.next();
            System.out.println(employee);
        }
    }
}
