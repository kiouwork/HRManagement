package com.fby.map;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * ClassName: PropertiesTest
 * Package: com.fby.map
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2024/2/28 - 9:01
 * @Version: V0.1
 */
public class PropertiesTest {
    @Test
    public void test1() throws IOException {
        File file = new File("info.properties");
        FileInputStream fis = new FileInputStream(file);
        System.out.println(file.getAbsolutePath());

        Properties pros = new Properties();
        pros.load(fis);

        String name = pros.getProperty("name");
        String age = pros.getProperty("password");

        System.out.println(name + ":" + age);
        fis.close();
    }

//    public static void main(String[] args) {
//        File file = new File("info.properties");
//        System.out.println(file.getAbsolutePath());
//    }
}
