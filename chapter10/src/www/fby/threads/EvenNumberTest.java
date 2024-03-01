package www.fby.threads;

/**
 * ClassName: EvenNumberTest
 * Package: www.fby.threads
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/11/7 - 22:39
 * @Version: V0.1
 */
public class EvenNumberTest {
    public static void main(String[] args) {
        PrintNumber p1 = new PrintNumber();
        p1.start();
        PrintNumber p2 = new PrintNumber();
        p2.start();
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + "*=" + i);
            }
        }
    }
}

class PrintNumber extends Thread{
    public void run(){
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + " " +i);
            }
        }
    }
}
