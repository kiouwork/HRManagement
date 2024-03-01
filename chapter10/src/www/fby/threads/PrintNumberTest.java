package www.fby.threads;

/**
 * ClassName: PrintNumberTest
 * Package: www.fby.threads
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/11/8 - 1:37
 * @Version: V0.1
 */
public class PrintNumberTest {
    public static void main(String[] args) {
        EvenNumberPrint j1 = new EvenNumberPrint();
        j1.start();
        OddNumberPrint o1 = new OddNumberPrint();
        o1.start();
    }


}

class EvenNumberPrint extends Thread{
    public void run(){
        for (int i = 0; i <= 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        }
    }
}

class OddNumberPrint extends Thread{
    public void run(){
        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 1){
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        }
    }
}
