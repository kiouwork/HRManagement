package com.fby08._interface.jdk8;

/**
 * ClassName: CompareA
 * Package: com.fby08._interface.jdk8
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/10/25 - 20:47
 * @Version: V0.1
 */
public interface CompareA {
    void method1();

//静态方法
    public static void method2(){
        System.out.println("静态CompareA2:北京");
    }
//默认方法
    public default void method3(){
        System.out.println("默认CompareA3:上海");
    }
    public default void method4(){
        System.out.println("默认CompareA4:广州");
    }
    public default void method5(){
        System.out.println("默认CompareA5:深圳");
    }
}
