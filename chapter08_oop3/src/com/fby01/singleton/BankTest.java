package com.fby01.singleton;

/**
 * ClassName: BankTest
 * Package: com.fby01.singleton
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/10/22 - 20:57
 * @Version: V0.1
 */
public class BankTest {
    public static void main(String[] args) {
//        Bank b1 = new Bank();
        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();
        System.out.println(bank1 == bank2);
    }
}

class Bank{
    //饿汉式
    //1、创建私有构造器
    private Bank(){}
    //2、声明当前类的实力
    //4、修改属性为static
    private static Bank instance = new Bank();
    //3、通过get方法获得该实例
    public static Bank getInstance(){
        return instance;
    }
}

//懒汉式
class TBank{
    private TBank(){}

    private static TBank instance = null;

    public static TBank getInstance(){
        if(instance == null){
            instance = new TBank();
        }
        return instance;
    }
}