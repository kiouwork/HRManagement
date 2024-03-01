package www.fby.threadsafe;

/**
 * ClassName: WindowTest1
 * Package: www.fby.threadsafe
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/11/10 - 3:01
 * @Version: V0.1
 */
public class WindowTest1 {
    public static void main(String[] args) {
        Window w1 = new Window();
        Window w2 = new Window();
        Window w3 = new Window();

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();

    }
}

class Window extends Thread{
    static int ticket = 100;
    static Object obj = new Object();//使用static静态修饰后，可以使用Object
    @Override
    public void run() {
        while (true){
            synchronized (Window.class) {
                if(ticket > 0){
                    System.out.println(Thread.currentThread().getName() + "售票，票号为：" + ticket);
                    ticket--;
                }else {
                    break;
                }
            }
        }
    }
}
