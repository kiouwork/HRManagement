package www.fby.exer3;

import java.util.concurrent.locks.ReentrantLock;

/**
 * ClassName: LockTest
 * Package: www.fby.exer3
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/11/14 - 3:07
 * @Version: V0.1
 */
public class LockTest {
    public static void main(String[] args) {
        window w1 = new window();
        window w2 = new window();
        window w3 = new window();

        w1.setName("窗口1：");
        w2.setName("窗口2：");
        w3.setName("窗口3：");

        w1.start();
        w2.start();
        w3.start();
    }
}

class window extends Thread {
    static int ticket = 100;

    private static final ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();
                if (ticket > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "售票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            } finally {
                lock.unlock();
            }
        }
    }
}