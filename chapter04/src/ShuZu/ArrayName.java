package ShuZu;

import java.util.Scanner;

public class ArrayName {
    public static void main(String[] args) {
        /*
        用一个数组存储本组学员的姓名，先从键盘输入小组人数，
        再从键盘输入每一个学员的姓名，然后遍历显示。
         */

        Scanner input = new Scanner(System.in);
        System.out.println("请输入小组人数：");
        int count = input.nextInt();

        String[] Names = new String[count];

        for(int i=0; i<Names.length; i++){
            System.out.println("请输入第" + (i+1) + "个学员的姓名：");
            //数组的元素相当于是变量，所以可以重复赋值
            Names[i] = input.next();
        }

        //显示结果
        System.out.println("本组学员有：");
        for(int i = 0; i<Names.length; i++){
            System.out.println(Names[i]);
        }
        input.close();
    }
}
