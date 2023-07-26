package tiaojianYSF;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("请输入你的姓名：");
        String str = input.next();

        System.out.print("请输入你的性别：");
        char sex = input.next().charAt(0);

        System.out.print("请输入你的年龄：");
        int age = input.nextInt();

        System.out.print("请输入你的体重：");
        double eight = input.nextDouble();

        System.out.print("请输入你的婚否：");
        String lonely = input.next();

        System.out.println("姓名：" + str);
        System.out.println("性别：" + sex);
        System.out.println("年龄：" + age);
        System.out.println("体重：" + eight);
        System.out.println("婚否情况：" + lonely);

        input.close();
    }
}
