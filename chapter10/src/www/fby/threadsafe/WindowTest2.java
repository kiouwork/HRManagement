package www.fby.threadsafe;

/**
 * ClassName: WindowTest2
 * Package: www.fby.threadsafe
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/11/10 - 4:08
 * @Version: V0.1
 */
public class WindowTest2 {
    public static void main(String[] args) {
        Window2 w1 = new Window2();
        Window2 w2 = new Window2();
        Window2 w3 = new Window2();

        w1.setName("窗口1： ");
        w2.setName("窗口2： ");
        w3.setName("窗口3： ");

        w1.start();
        w2.start();
        w3.start();
    }
}

class Window2 extends Thread {
    static int ticket = 100;
    static boolean isFlag = true;

    @Override
    public void run() {
        while (isFlag) {
            show();
        }
    }

    public void show() {
        synchronized (Window2.class) {
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
}