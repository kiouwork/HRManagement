import java.util.Scanner;

/**
 * ClassName: ArrayExer03
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2023/6/9 - 5:37
 * @Version: V0.1
 */
public class ArrayExer03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入成绩个数：");
        int count = scanner.nextInt();
        int[] arr = new int[count];
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("请输入第" + (i + 1) + "个数：");
            arr[i] = scanner.nextInt();
            if (arr[i] > temp) {
                temp = arr[i];
            }
        }
        System.out.println("最高得分是：" + temp);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= temp - 10) {
                System.out.println("student" + i + "的成绩是" + arr[i] + ",获得A");
            } else if (arr[i] >= temp - 20) {
                System.out.println("student" + i + "的成绩是" + arr[i] + ",获得b");
            } else if (arr[i] >= temp - 30) {
                System.out.println("student" + i + "的成绩是" + arr[i] + ",获得c");
            } else {
                System.out.println("student" + i + "的成绩是" + arr[i] + ",获得d");
            }
        }
        scanner.close();
    }
}

