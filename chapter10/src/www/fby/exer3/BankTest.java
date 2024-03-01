package www.fby.exer3;

/**
 * ClassName: BankTest
 * Package: www.fby.exer3
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/11/13 - 21:57
 * @Version: V0.1
 */
public class BankTest {
        static Bank b1 = null;
        static Bank b2 = null;
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                b1 = Bank.getInstance();
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                b2 = Bank.getInstance();
            }
        };
        t1.start();
        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1 == b2);
    }
}

class Bank{
    private Bank(){}
    private static Bank instance = null;
    public static synchronized Bank getInstance(){
        if(instance == null){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new Bank();
        }
        return instance;
    }
}

