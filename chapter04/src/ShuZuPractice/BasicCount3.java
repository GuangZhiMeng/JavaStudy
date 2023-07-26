package ShuZuPractice;
/*
找最大值/最小值，及其下标
 */
public class BasicCount3 {
    public static void main(String[] args) {
        int[] arr = {3,5,6,1,2};

        int max = arr[0];//存储当前最大值
        int index = 0;//存储当前最大值的下标
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
                index = i;
            }
        }
        System.out.println("最大值：" + max);
        System.out.println("下标：[" + index + "]");

        // 方法2
        int maxIndex = 0;//存储当前最大值的下标
        for(int i = 1; i < arr.length ; i++){
            if(arr[i] > arr[maxIndex]){
                arr[maxIndex] = arr[i];
                maxIndex = i;
            }
        }
        System.out.println("最大值：" + arr[maxIndex]);
        System.out.println("下标：[" + maxIndex + "]");
    }
}
