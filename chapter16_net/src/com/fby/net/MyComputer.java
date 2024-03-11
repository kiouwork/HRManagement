package com.fby.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * ClassName: MyComputer
 * Package: com.fby.net
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2024/3/9 - 4:23
 * @Version: V0.1
 */
public class MyComputer {
    public static void main(String[] args) {
        String str1 = "192.168.12.";

        for (int i = 1; i < 256; i++) {
            String temp;
            temp = str1 + i;
            try {
                System.out.println(InetAddress.getByName(temp).getHostAddress());
            } catch (UnknownHostException e) {
                e.printStackTrace();
            }
        }

    }


}
