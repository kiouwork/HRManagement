package com.fby.map.exer1;

import java.util.Objects;

/**
 * ClassName: User
 * Package: com.fby.set
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2024/1/23 - 19:55
 * @Version: V0.1
 */
public class User implements Comparable{
    private String name;
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("User equals()....");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Object o) {
        if(this == o) return 0;

        if(o instanceof User){
            User u = (User) o;
            return this.age - u.age;
        }
        throw new RuntimeException("类型不匹配");
    }
}
