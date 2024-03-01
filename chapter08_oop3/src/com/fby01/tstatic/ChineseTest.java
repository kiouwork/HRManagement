package com.fby01.tstatic;

/**
 * ClassName: ChineseTest
 * Package: com.fby01.tstatic
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/10/19 - 4:23
 * @Version: V0.1
 */
public class ChineseTest {
    public static void main(String[] args) {
        Chineses c1 = new Chineses();
        c1.name = "姚明";
        c1.age = 40;
        c1.nation = "china";

        Chineses c2 = new Chineses();
        c2.name = "liuxiang";
        c2.age = 39;

        System.out.println(c1);
        System.out.println(c2);

        System.out.println(c1.nation);
        System.out.println(c2.nation);
        Chineses.show();
    }
}

class Chineses{
    String name;
    int age;

    static String nation;

    @Override
    public String toString() {
        return "Chineses{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void eat(String food){
        System.out.println("i like eat" + food);
    }

    public static void show(){
        System.out.println("i am chinese");
        System.out.println("nation = " + nation);
        method1();
    }

    public static void method1(){
        System.out.println("test");
    }
}