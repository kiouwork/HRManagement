package www.fby.exer3;

/**
 * ClassName: AccountTest
 * Package: www.fby.exer3
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/11/13 - 20:41
 * @Version: V0.1
 */
public class AccountTest {
    public static void main(String[] args) {
        Account acct = new Account();

        Customer cust1 = new Customer(acct, "甲");
        Customer cust2 = new Customer(acct, "乙");

        cust1.start();
        cust2.start();
    }
}
class Account{
    private double balance;//余额
    public synchronized void deposit(double amt){
        if(amt >=0){
            balance += amt;
        }
        System.out.println(Thread.currentThread().getName() + "存钱1000元！，现在余额为：" + balance);
    }
}
class Customer extends Thread{
    Account account;
    public Customer( Account account){
        this.account = account;
    }
    public Customer(Account account, String name) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            account.deposit(1000);
        }
    }
}