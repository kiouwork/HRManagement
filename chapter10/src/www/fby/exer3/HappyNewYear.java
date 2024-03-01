package www.fby.exer3;

/**
 * ClassName: HappyNewYear
 * Package: www.fby.exer3
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/11/13 - 19:30
 * @Version: V0.1
 */
public class HappyNewYear {
    public static void main(String[] args) {
        DaoTime dt1 = new DaoTime();

        Thread t1 = new Thread(dt1);
        Thread t2 = new Thread(dt1);
        Thread t3 = new Thread(dt1);

        t1.setName("1号：");
        t2.setName("2号：");
        t3.setName("3号：");

        t1.start();
        t2.start();
        t3.start();
    }
}

class DaoTime implements Runnable {
    boolean isFlag = true;
    int num = 10;

    @Override
    public void run() {
        while (isFlag) {
            show();
        }
    }

    public synchronized void show() {
        if (num > 0) {
            System.out.println(Thread.currentThread().getName() + "" + num);
            num--;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if(num == 0){
            num--;
            System.out.println("heppy new year!");
            isFlag = false;
        }
    }
}