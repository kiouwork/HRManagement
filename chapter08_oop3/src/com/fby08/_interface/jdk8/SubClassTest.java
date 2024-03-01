package com.fby08._interface.jdk8;

/**
 * ClassName: SubClassTest
 * Package: com.fby08._interface.jdk8
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/10/25 - 20:53
 * @Version: V0.1
 */
public class SubClassTest {
    public static void main(String[] args) {
        //创建接口CompareA的匿名实现类对象
        CompareA com1 = new CompareA() {
            @Override
            public void method1() {
                System.out.println("这是哪里？");
            }
        };
        com1.method1();
//对象不可以直接使用接口的静态方法，除非重写
//        com1.method2();
//直接调用接口的静态方法
        CompareA.method2();
//接口的实现类重写了静态方法method2，所以可以条用
        SubClass.method2();
        System.out.println();
        SubClass s1 = new SubClass();
//        实现了接口的抽象方法
        s1.method1();
//        重写了接口的静态方法
        s1.method2();
        s1.method3();
        s1.method4();
        s1.method5();
        System.out.println("=================");
        s1.method00();
    }
}
