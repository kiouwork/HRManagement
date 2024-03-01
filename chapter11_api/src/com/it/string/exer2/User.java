package com.it.string.exer2;

/**
 * ClassName: User
 * Package: com.it.string.exer2
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/11/23 - 22:07
 * @Version: V0.1
 */
public class User {
    private String name;
    private String password;

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return name + "-" + password;
    }
}
