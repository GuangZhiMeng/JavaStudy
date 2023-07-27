import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        //冒泡排序算法:相邻的两个数进行比较,如果第一个比第二个大, 就交换他们两个
        int[] arr = {22, 55, 44, 33, 11};

        //外循环：比较的轮数
        for (int i = 0; i < arr.length-1; i++) {

            //内循环：比较的次数
            //-1:防止出现下标越界
            //-i:提高代码的运行效率
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    //进行三角交换
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}