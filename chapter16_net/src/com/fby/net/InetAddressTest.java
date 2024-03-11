package com.fby.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * ClassName: InetAddressTest
 * Package: com.fby.net
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2024/3/9 - 4:15
 * @Version: V0.1
 */
public class InetAddressTest {
    public static void main(String[] args) {
        try {
            //getByName(String host)
            InetAddress inet1 = InetAddress.getByName("192.168.12.192");
            System.out.println(inet1);

            InetAddress inet2 = InetAddress.getByName("www.163.com");
            System.out.println(inet2);

            //getLocalHost
            InetAddress inet3 = InetAddress.getLocalHost();
            System.out.println(inet3);
            InetAddress inet4 = InetAddress.getByName("Fby-xxzx09");
            System.out.println(inet4);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
