/**
 * ClassName: ToStringTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/10/18 - 21:19
 * @Version: V0.1
 */
public class ToStringTest {
    public static void main(String[] args) {
        User2 u1 = new User2("Tom", 12);
        System.out.println(u1.toString());
    }
}

class User2{
    String name;
    int age;

    public User2() {
    }

    public User2(String name, int age) {
        this.name = name;
        this.age = age;
    }
}