package ShuZuPractice;
/*
找出最大值和所有最大值的下标（包括一样的）
 */
public class BasicCount4 {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,2,7,1};
        /*
        思路:
        1、先找到最大值
        2、循环变量看那些元素和最大值一样
         */
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("最大值是:" + max);
        System.out.println("最大值的下标有：");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == max){
                System.out.println("[" + i + "]");
            }
        }
    }
}
