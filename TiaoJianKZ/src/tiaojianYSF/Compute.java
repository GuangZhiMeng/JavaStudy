package tiaojianYSF;

import java.util.Scanner;

public class Compute {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("请输入第一个操作数：");
        int a = input.nextInt();

        System.out.println("请输入第二个操作数：");
        int b = input.nextInt();

        System.out.println(a + "+" + b + "=" + (a + b));
        System.out.println(a + "-" + b + "=" + (a - b));
        System.out.println(a + "*" + b + "=" + (a * b));
        System.out.println(a + "/" + b + "=" + (a / b));
        System.out.println(a + "%" + b + "=" + (a % b));

        input.close();
    }
}
