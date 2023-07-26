package tiaojianYSF;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a:");
        int a = scanner.nextInt();

        System.out.print("Please input b:");
        int b = scanner.nextInt();

        System.out.println("Please input : + or - or * or / or % ");
        String strC = scanner.next();
        char c = strC.charAt(0);
        boolean A = true;
        while (A) {
            switch (c) {
                case '+':
                    System.out.println(a + "+" + b + "=" + (a + b));
                    A = false;
                    break;
                case '-':
                    System.out.println(a + "-" + b + "=" + (a - b));
                    A = false;
                    break;
                case '*':
                    System.out.println(a + "*" + b + "=" + (a * b));
                    A = false;
                    break;
                case '/':
                    if (b == 0) {
                        System.out.println("b = 0 /分母不能为零!");
                        A = false;
                        break;
                    }
                    System.out.println(a + "/" + b + "=" + (a / b));
                    A = false;
                    break;
                case '%':
                    if (b == 0) {
                        System.out.println("b = 0 /分母不能为零!");
                        A = false;
                        break;
                    }
                    System.out.println(a + "%" + b + "=" + (a % b));
                    A = false;
                    break;
                default:
                    System.out.println("运算符输入错误！");
                    A = false;
                    break;
            }
        }//while 循环
    }
}
