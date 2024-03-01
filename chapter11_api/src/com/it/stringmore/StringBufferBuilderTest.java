package com.it.stringmore;

import org.junit.Test;

/**
 * ClassName: StringBufferBuilderTest
 * Package: com.it.stringmore
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/11/24 - 3:36
 * @Version: V0.1
 */
public class StringBufferBuilderTest {

    @Test
    public void test1(){
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append("abc").append("123").append("pk");
        System.out.println(sBuilder);
    }

    @Test
    public void test2(){
        StringBuilder sBuilder = new StringBuilder("hello");
        sBuilder.insert(2,".....");
        System.out.println(sBuilder);
    }
}
