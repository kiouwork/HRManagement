package com.fby04.block;

/**
 * ClassName: User
 * Package: com.fby04.block
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/10/23 - 2:35
 * @Version: V0.1
 */
public class UserTest {
    public static void main(String[] args) {
        User u1 = new User();
        System.out.println(u1.getInfo());
        User u2 = new User("Tom","65321");
        System.out.println(u2.getInfo());
        int z = 0;
        int y;
        z--;
        System.out.println("z-- : " +z);
        y = z++ + ++z;
        System.out.println("y:" + y);
        System.out.println("z:" + z);
        System.out.println(z + y + ++z);
    }
}

class User{
    private String userName;
    private String password;
    private long registrationTime;

    public User() {
        System.out.println("新用户注册：");
        registrationTime = System.currentTimeMillis();
        userName = System.currentTimeMillis() + "";
        password = "123456";
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
        System.out.println("新用户注册：");
        registrationTime = System.currentTimeMillis();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getRegistrationTime() {
        return registrationTime;
    }

    public String getInfo(){
        return "[用户名：" + getUserName() +",密码：" + getPassword() + ",注册时间：" + getRegistrationTime() + "]";
    }
}
