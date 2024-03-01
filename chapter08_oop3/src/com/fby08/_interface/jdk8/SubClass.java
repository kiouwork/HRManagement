package com.fby08._interface.jdk8;

/**
 * ClassName: SubClass
 * Package: com.fby08._interface.jdk8
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/10/25 - 20:52
 * @Version: V0.1
 */
public class SubClass extends SuperClass implements CompareA,CompareB{
    @Override
    public void method1() {
        System.out.println("抽象SubClass1:青岛");
    }
    public static void method2(){
        System.out.println("静态SubClass2:青岛2");
    }

    @Override
    public void method5() {
        System.out.println("重写了方法5SubClass:诸城");
    }

    public void method00(){
        method5();
        CompareA.super.method5();
        CompareB.super.method5();
        method3();
        super.method3();
        CompareA.super.method3();
    }
}
