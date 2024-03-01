package com.fby08._interface;

/**
 * ClassName: USBTest
 * Package: com.fby08._interface
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/10/24 - 21:43
 * @Version: V0.1
 */
public class USBTest {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.transferData(new Printer());

        USB usb1 = new USB(){

            @Override
            public void start() {
                System.out.println("U盘开始工作");
            }

            @Override
            public void end() {
                System.out.println("U盘结束工作");
            }
        };
        computer.transferData(usb1);
        computer.transferData(new USB(){
            @Override
            public void start() {
                System.out.println("未知设备开始工作");
            }

            @Override
            public void end() {
                System.out.println("未知设备结束工作");
            }
        });
    }
}

class Computer{
    public void transferData(USB usb){
        System.out.println("设备链接成功：");
        usb.start();
        System.out.println("数据传输……");
        usb.end();
    }
}
interface USB{
    public static final String NAME = "USB";
    public abstract void start();
    public abstract void end();
}
class Printer implements USB {

    @Override
    public void start() {
        System.out.println("打印机开始工作……");
    }

    @Override
    public void end() {
        System.out.println("打印机结束工作！");
    }
}