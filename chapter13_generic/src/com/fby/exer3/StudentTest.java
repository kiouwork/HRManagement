package com.fby.exer3;

/**
 * ClassName: StudentTest
 * Package: com.fby.exer3
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2024/3/22 - 10:47
 * @Version: V0.1
 */
public class StudentTest {
    public static void main(String[] args) {
        Student<String> s1 = new Student("张三", "良好");
        Student<String> s2 = new Student("李四", "优秀");
        Student<String> s3 = new Student("王五", "及格");


        Student<Double> s4 = new Student("张小三", 80.1);
        Student<Double> s5 = new Student("李四小", 99);
        Student<Double> s6 = new Student("王小五", 70.5);

        Student<Character> s7 = new Student<>("张小小三", 'B');
        Student<Character> s8 = new Student<>("李小小四", 'A');
        Student<Character> s9 = new Student<>("王小小五", 'C');

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println(s7);
        System.out.println(s8);
        System.out.println(s9);

//犯蠢的打印
//        for (int i = 1; i < 10; i++) {
//            System.out.println("s"+i);
//        }
    }
}
