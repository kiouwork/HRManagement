package com.fby01.tstatic;

/**
 * ClassName: CircleTest
 * Package: com.fby01.tstatic
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/10/20 - 4:29
 * @Version: V0.1
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Circle c3 = new Circle();
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}

class Circle{
    double radius;
    int id;
    static int init;

    public Circle() {
        this.id = init;
        init++;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", id=" + id +
                '}';
    }
}
