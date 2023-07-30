package string.StringBuilder;

import java.util.Scanner;

public class StringBuilderReverese {
    public static void main(String[] args) {
        // 键盘输入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入对称字符串：");
        String s = sc.nextLine();

        // 将键盘录入的字符串反转
        // 将字符串封装为StringBuilder对象，是为了调用其反转的方法
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();

        // s:String  sb:StringBuilder
        // 类型不一样无法进行比较
        String reverseStr = sb.toString();

        //使用反转后的字符串，和原字符串进行比对
        if (s.equals(reverseStr)){
            System.out.println("是对称字符串");
        }else {
            System.out.println("不是对称字符串");
        }

    }
}
