package String;

import java.util.Scanner;

public class StringBianLi {
    public static void main(String[] args) {
        // 键盘录入一个字符串，用 Scanner 实现
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要遍历的字符串：");
        String str = sc.nextLine();

        // 将字符串拆分成字符数组
        char[] chars = str.toCharArray();

        // 遍历字符数组
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }
}
