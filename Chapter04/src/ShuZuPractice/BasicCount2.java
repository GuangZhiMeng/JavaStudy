package ShuZuPractice;
/*
数组的基础算法2：
找最值，找最大值或最小值
 */
public class BasicCount2 {
    public static void main(String[] args) {
        // 元素个数有10个，通过Math.random()产生，范围[0,100)
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100);
            System.out.println(arr[i]);
        }

        //思路：
        //找出它们中最大的值
        int max = arr[0];//假设第一个元素最大
        //arr[0]元素不用和max比了，所以 i=1
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){//找最小值，就把大于号变成小于号
                max = arr[i];
            }
        }
        System.out.println("最大值：" + max);
    }
}
