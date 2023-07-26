package tiaojianYSF;

import java.util.Scanner;

public class TestInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //这行代码唯一可以改的是input 因为它是一个变量名

        System.out.print("请输入一个整数:");

        int num = input.nextInt();
        //从键盘开始输入
        System.out.println("num = " + num);

        System.out.print("请输入一个小数：");
        double d = input.nextDouble();
        System.out.println("d = " + d);

        System.out.print("请输入一个字符串：");
        String src = input.next();
        System.out.println("src = " + src);

        System.out.print("请输入单个字符：");
        char c = input.next().charAt(0);
        System.out.println("c = " + c);

        input.close();
    }
}
