package String;

import java.util.Scanner;

public class StringReplace {
    public static void main(String[] args) {
        // 输入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一段你要说的话：");
        String talk = sc.nextLine();

        // 替换敏感词
        String result = talk.replace("TMD","***");

        // 输出结果
        System.out.println(result);
    }
}
