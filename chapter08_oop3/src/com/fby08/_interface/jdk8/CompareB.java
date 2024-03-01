package com.fby08._interface.jdk8;

/**
 * ClassName: CompareB
 * Package: com.fby08._interface.jdk8
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/10/25 - 20:51
 * @Version: V0.1
 */
public interface CompareB {
    void method1();

    public default void method5(){
        System.out.println("CompareB:方法5：天津");
    }
}
