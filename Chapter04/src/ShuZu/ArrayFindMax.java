package ShuZu;

import java.util.Scanner;

/*
先从键盘输入小组人数，然后声明两个数组，一个存储本组学员姓名，一个存储本组学员成绩，
再从键盘输入每一个学员的姓名和成绩，遍历显示小组中每一个学员的姓名和分数。最后显示最高分同学的姓名和成绩。
 */
public class ArrayFindMax {
    public static void main(String[] args) {
        //先从键盘输入小组人数
        Scanner input = new Scanner(System.in);
        System.out.println("请输入小组人数：");
        int count = input.nextInt();

        //声明两个数组一个存储本组学员姓名，一个存储本组学员成绩
        String[] Names = new String[count];
        int[] grades = new int[count];

        //遍历显示小组中每一个学员的姓名和分数
        for (int i = 0; i < count; i++) {
            System.out.print("请输入第" + (i+1) + "个学员的姓名：");
            //数组的元素相当于是变量，所以可以重复赋值
            Names[i] = input.next();
            System.out.print("请输入他/她的分数：");
            grades[i] = input.nextInt();
        }

        //显示学员的姓名和分数
        System.out.println("本组学员有：");
        for (int i = 0; i < count; i++) {
            System.out.print(Names[i] + ":");
            System.out.print(grades[i] + "\n");
        }

        //找出最大值
        int max = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if(grades[i] > max){
                max = grades[i];
            }
        }
        //显示最高分同学的姓名和成绩。
        //String result = "";
        System.out.println("考了最高分的是：");
        for (int i = 0; i < grades.length; i++) {
            if(grades[i] == max){
                System.out.println(Names[i]);
                System.out.println("他/她的成绩是："+ max);
            }
            /*
               if(scores[i] == max){
                    result += names[i] + "  ";
               }
             */
        }
//        System.out.println("最高分：" + max);
//        System.out.println("最高分姓名：" + result);
    }
}
