package ShuZuPractice;

import java.util.Scanner;

/*
2、从键盘接收用户输入的字母，可以重复输入某个字母
最后统计每个小写字母出现的次数。
要求：
(1) 如果用户输入是小写字母，统计它的个数，否则不统计这个字符的数量
(2) 如果用户输入0，则输入结束
(3) 输入结束后，遍历显示每个字母出现的次数
提示：
使用一个数组，长度为26，用来存储每个字母出现的次数
 */
public class ArrayPractice2 {
    public static void main(String[] args) {
        int[] letterCounts = new int[26];//元素默认值是0
        /*
        letterCounts[0]存到的是'a'的次数
        letterCounts[1]存到的是'b'的次数
        letterCounts[2]存到的是'c'的次数
        ……
        letter是小写字母的话，letterCounts[letter-97]
         */
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.print("请输入字母（输入0结束）：");
            char letter = input.next().charAt(0);

            if(letter >= 'a' && letter <= 'z'){
                letterCounts[letter-97]++;
            }else if(letter == '0'){//letter == 48
                break;
            }
        }

        for (int i = 0; i < letterCounts.length; i++) {
            if(letterCounts[i]!=0){
                System.out.println((char)(i + 'a') + ":" + letterCounts[i]);
            }
        }
    }
}
