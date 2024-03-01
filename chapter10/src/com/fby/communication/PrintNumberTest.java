package com.fby.communication;

/**
 * ClassName: PrintNumberTest
 * Package: com.fby.communication
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/11/15 - 20:42
 * @Version: V0.1
 */
public class PrintNumberTest {
    public static void main(String[] args) {
        PrintNumber p = new PrintNumber();
        Thread t1 = new Thread(p,"线程1：");
        Thread t2 = new Thread(p,"线程2：");

        t1.start();
        t2.start();
    }
}

class PrintNumber implements Runnable{
    private int number = 1;
    @Override
    public void run() {
        while (true){
            synchronized (this) {
                notify();
                if (number <= 100){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + number);
                    number++;
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                    break;
                }
            }
        }
    }
}