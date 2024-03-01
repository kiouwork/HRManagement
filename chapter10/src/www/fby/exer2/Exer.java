package www.fby.exer2;

/**
 * ClassName: Exer
 * Package: www.fby.exer2
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/11/9 - 1:07
 * @Version: V0.1
 */
public class Exer {
    public static void main(String[] args) {
        A a = new A();
        a.start();
        B b = new B("线程1：---》");
        b.start();
    }

}

class A extends Thread{
    public void run(){
        System.out.println("A run…………");
    }
}

class B extends Thread{
//    private A a;
    public B(){}
    public B(String name){
        super(name);
    }

    public void run(){
        System.out.println(Thread.currentThread().getName() + "B run ........");
    }
}