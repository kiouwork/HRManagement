/**
 * ClassName: RecursionTest02
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/6/18 - 21:12
 * @Version: V0.1
 */
public class RecursionTest02 {
    public static void main(String[] args) {
        RecursionTest02 t2 = new RecursionTest02();
        System.out.println(t2.f1(10));
    }
    public int f1(int n){
        if (n == 0){
            return 1;
        }else if(n == 1){
            return 4;
        }else {
            return 2 * f1(n -1) + f1(n -2);
        }
    }
}
