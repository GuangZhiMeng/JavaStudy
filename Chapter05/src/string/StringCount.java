package string;

import java.util.Scanner;

public class StringCount {
    public static void main(String[] args) {
        //
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = sc.nextLine();

        int bigCount = 0;
        int smallCount = 0;
        int numCount = 0;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];

            if(c >= 'A' && c <= 'Z'){
                bigCount++;
            }else if (c >= 'a' && c <= 'z'){
                smallCount++;
            }else if (c >= '0' && c <= '9'){
                numCount++;
            }
        }

        //
        System.out.println("大写字母字符有：" + bigCount + "个");
        //System.out.printf("大写字母字符有：%d\n",bigCount);
        System.out.println("小写字母字符有：" + smallCount + "个");
        System.out.println("数字字符有：" + numCount + "个");
    }
}
