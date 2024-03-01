/**
 * ClassName: Test5
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/6/11 - 22:04
 * @Version: V0.1
 */
public class Test5 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            testnum();
        }
    }

    static void testnum() {
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 30) + 1;
            boolean flag = true;
            int count = 0;
            while (flag) {
                for (int j = 1; j < i; j++) {
                    if (arr[i] == arr[j]) {
                        arr[i] = (int) (Math.random() * 30) + 1;
                        count++;
                    }
                }
                if (count == 0) {
                    flag = false;
                } else {
                    count = 0;
                }
            }
        }
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

}
