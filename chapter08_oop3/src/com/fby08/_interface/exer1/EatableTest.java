package com.fby08._interface.exer1;

/**
 * ClassName: Eatable
 * Package: com.fby08._interface.exer1
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/10/25 - 4:07
 * @Version: V0.1
 */
public class EatableTest {
    public static void main(String[] args) {
        Eatable[] eatable = new Eatable[3];
        eatable[0] = new China();
        eatable[1] = new American();
        eatable[2] = new Indian();

        for(int i = 0; i < eatable.length;i ++){
            eatable[i].eat();
        }
    }
}
