package com.fby.io;

import org.junit.Test;

import java.io.File;

/**
 * ClassName: FileTest
 * Package: com.fby.io
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2024/4/11 - 3:02
 * @Version: V0.1
 */
public class FileTest {
    @Test
    public void test1(){
        //绝对路径
        File file = new File("D:\\Develop\\Java\\JavaSECode\\chapter15_io\\src\\com\\fby\\io\\123.txt");
        //相对路径
        File file1 = new File("abc");
        System.out.println(file1.exists());
        System.out.println(file.getAbsolutePath());
        File file2 = new File("io", "file2");
        System.out.println(file2.getAbsolutePath());
        File file3 = new File(file2, "file3.txt");
        System.out.println(file3.getAbsolutePath());
    }

    @Test
    public void test2(){
        File file = new File("d:\\develop\\java\\javasecode\\chapter15_io\\src\\com\\fby\\io\\123.txt");
        System.out.println("文件名字:" + file.getName());
        System.out.println("获取路径" + file.getPath());
        System.out.println("juedui" + file.getAbsolutePath());
        System.out.println("wenjian" + file.getAbsoluteFile());
        System.out.println("up" + file.getParent());
        System.out.println("size" + file.length());
        System.out.println("time" + file.lastModified());
    }
    @Test
    public void test3(){
        File file1 = new File("D:\\Tools");
        String[] listArr = file1.list();
        for(String s : listArr){
            System.out.println(s);
        }
        System.out.println();
        File[] files = file1.listFiles();
        for(File f : files){
            System.out.println(f);
        }
    }
}
