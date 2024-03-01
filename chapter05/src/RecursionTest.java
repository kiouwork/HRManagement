/**
 * ClassName: RecursionTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/6/18 - 20:56
 * @Version: V0.1
 */
public class RecursionTest {
    public static void main(String[] args) {
        RecursionTest t1 = new RecursionTest();
        System.out.println(t1.f(10));
    }
    public int f(int n){
        if(n == 20){
            return 1;
        }else if(n == 21){
            return 4;
        }else {
            return f(n + 2) - 2 * f(n + 1);
        }
    }
}