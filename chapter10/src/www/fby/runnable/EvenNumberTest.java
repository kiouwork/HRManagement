package www.fby.runnable;

/**
 * ClassName: EvenNumberTest
 * Package: www.fby.runnable
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/11/8 - 1:57
 * @Version: V0.1
 */
public class EvenNumberTest {
    public static void main(String[] args) {
        EvenNumberPrint e1 = new EvenNumberPrint();
        new Thread(e1).start();

        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 1){
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        }
    }
}

class EvenNumberPrint implements Runnable{
    public void run(){
        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 1){
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        }
    }
}
