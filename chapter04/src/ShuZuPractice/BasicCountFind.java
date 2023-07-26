package ShuZuPractice;

import java.util.Scanner;

/*
3、数组元素的查找
（1）顺序查找：数组的元素挨个与目标做比对，如果相等，就表示找到了，所有元素都不等，就是没找到
 */
public class BasicCountFind {
    public static void main(String[] args) {
        //随机生成10个元素[0,100)，从键盘输入一个值，看它是否在元素列表中
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100);
        }

        Scanner input = new Scanner(System.in);
        System.out.println("请输入你要查找的数：");
        int target = input.nextInt();
        
        //顺序查找
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                System.out.println("下标是：[" + i + "]");
                flag = true;
            }
        }
        if(!flag){
            System.out.println("不存在");
        }

        // 显示一下元素
        System.out.println("10个元素是：");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
