package HeiMaOOP;

import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {
        // 创建Scanner对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数：");
        int num = sc.nextInt();
        System.out.println(num);

        System.out.println("请输入字符串：");
        String s = sc.nextLine();
        System.out.println(s);
    }
}
