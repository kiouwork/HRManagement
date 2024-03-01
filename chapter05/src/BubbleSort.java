/**
 * ClassName: BubbleSort
 * Package: PACKAGE_NAME
 * Description:冒泡排序
 *
 * @Author: 王珏, James wang
 * @Create: 2023/6/15 - 1:28
 * @Version: V0.1
 */
public class BubbleSort {
    public static void main(String[] args) {
        //创建数组
        int[] arr = new int[]{30,20,10,15,60,77,33,29,66,2,8,7,9};
        //遍历数组，显示原数组内元素顺序
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        //冒泡排序
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = 0; j < arr.length -1 -i; j++) {
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        //遍历数组，显示排序后数组内元素顺序
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
