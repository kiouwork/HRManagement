import java.util.Scanner;

/**
 * ClassName: Test6_hui
 * Package: PACKAGE_NAME
 * Description:回型数组
 *
 * @Author: 王珏, James wang
 * @Create: 2023/6/12 - 6:00
 * @Version: V0.1
 */
public class Test6_hui {
    public static void main(String[] args) {
        //接受用户输入个数
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入个数：");
        int num = scanner.nextInt();
        //根据输入创建数组
        int[][] arr = new int[num][num];
        //设置4个边界量，left、right、up、down
        //左边界
        int mark_left = 0;
        //右边界
        int mark_right = arr[0].length;
        //上边界
        int mark_up = 0;
        //下边界
        int mark_down = arr[0].length;
        //具体数据
        int count = 0;
        //当前坐标，行x，列y
        int x = 0;
        int y = 0;
        //总个数
        int sum = num * num;
        boolean flag = true;
        //循环控制四个方向
        while (flag) {
            //右移
            for (int i = mark_left; i < mark_right && count < sum; i++) {
                count++;
                arr[x][i] = count;
                y = i;
                if (i == mark_right - 1) {
                    mark_up += 1;
                    x += 1;
                }
            }
            //下移
            for (int i = mark_up; i < mark_down && count < sum; i++) {
                count++;
                arr[i][y] = count;
                x = i;
                if(i == mark_down - 1){
                    mark_right -= 1;
                    y -= 1;
                }
            }
            //左移
            for (int i = mark_right - 1; i >= mark_left && count < sum; i--) {
                count++;
                arr[x][i] = count;
                y = i;
                if(i == mark_left){
                    mark_down -= 1;
                    x -= 1;
                }
            }
            //上移
            for (int i = mark_down -1; i >= mark_up && count < sum; i--) {
                count++;
                arr[i][y] = count;
                x = i;
                if(i == mark_up){
                    mark_left += 1;
                    y += 1;
                }
            }
            //终止循环
            if(count >= sum){
                flag = false;
            }
        }
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }
}
