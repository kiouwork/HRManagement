package com.fby.communication;

/**
 * ClassName: ProducerConsumerTest
 * Package: com.fby.communication
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/11/16 - 1:28
 * @Version: V0.1
 */
public class ProducerConsumerTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();

        Productor pro1 = new Productor(clerk);
        Customer cus1 = new Customer(clerk);
        Customer cus2 = new Customer(clerk);

        pro1.setName("生产者1：");
        cus1.setName("消费者1：");
        cus2.setName("消费者2：");

        System.out.println(pro1.getPriority());
        pro1.setPriority(7);
        System.out.println(pro1.getPriority());

        pro1.start();
        cus1.start();
        cus2.start();
    }
}

class Clerk {
    private int productNum = 0;
    private int sum = 0;

    public synchronized void addProduct() { //生产
        if (productNum >= 20) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            productNum++;
            System.out.println(Thread.currentThread().getName() + "生产了第" + productNum + "个产品");
            //唤醒
            notifyAll();
        }
    }

    public synchronized void minusProduct() { //消费
        if(productNum <= 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println(Thread.currentThread().getName() + "消费了第" + productNum + "个产品");
            productNum--;
            //唤醒
            notifyAll();
        }
    }
}

class Productor extends Thread {
    private Clerk clerk;

    public Productor(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {

        while (true) {
            System.out.println("生产者开始生产产品......");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.addProduct();

        }
    }
}

class Customer extends Thread {
    private Clerk clerk;

    public Customer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("消费者开始消费产品......");
            try {
                Thread.sleep(105);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.minusProduct();
        }
    }
}