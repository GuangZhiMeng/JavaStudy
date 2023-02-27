package String;

import java.util.Scanner;

public class StringIntercept {
    public static void main(String[] args) {
        // 键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入手机号：");
        String telString = sc.nextLine();

        // 截取字符串前三位
        String start = telString.substring(0,3);

        // 截取字符串后四位
        String end = telString.substring(7);

        // 将截取后的两个字符串，中间加上* * * * 进行拼接，输出结果
        System.out.println(start + "****" + end);
    }
}
