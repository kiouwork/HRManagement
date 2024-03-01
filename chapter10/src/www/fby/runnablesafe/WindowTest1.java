package www.fby.runnablesafe;

/**
 * ClassName: WindowTest1
 * Package: www.fby.runnablesafe
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/11/10 - 3:53
 * @Version: V0.1
 */
public class WindowTest1 {
    public static void main(String[] args) {
        SaleTicket1 s1 = new SaleTicket1();

        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s1);
        Thread t3 = new Thread(s1);

        t1.setName("窗口1：");
        t2.setName("窗口2：");
        t3.setName("窗口3：");

        t1.start();
        t2.start();
        t3.start();
    }
}

class SaleTicket1 implements Runnable {
    int ticket = 100;
    boolean isFlag = true;

    @Override
    public void run() {
        while (isFlag) {
            show();
        }
    }

    public synchronized void show() {
        if (ticket > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "售票，票号为：" + ticket);
            ticket--;
        } else {
            isFlag = false;
        }
    }
}
