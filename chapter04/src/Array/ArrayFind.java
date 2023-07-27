package Array;

import java.util.Scanner;

public class ArrayFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //定义一个数组，用静态初始化完成数组元素的初始化
        int[] arr = new int[] {19,28,37,46,55,66};
        
        System.out.println("请输入您要查找的元素：");
        //键盘录入要查找的数据,用一个变量接收
        int num = sc.nextInt();

        //定义一个索引变量，初始值为-1
        int index = -1;
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]){//拿键盘录入的数据和数组中的每一个元素进行比较
                index = i;//如果值相同,就把该值对应的索引赋值给索引变量,并结束循环
                break;
            }
        }
        //输出索引值
        System.out.println(index);
    }
}
