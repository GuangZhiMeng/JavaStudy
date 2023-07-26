package ShuZu;

import java.util.Scanner;
/*
有10个评委给参加编程比赛的某个选手的作品打分，从键盘输入10个评委的分数，并存储到一维数组中。
然后求选手的最后得分（去掉一个最高分和一个最低分后其余8位评委打分的平均值）
 */
public class PingWeiDaFeng {
    public static void main(String[] args) {
        //从键盘输入10个评委的分数
        int[] scores = new int[10];//动态数组的定义
        int sum = 0;//计算成绩总和
        Scanner input = new Scanner(System.in);
        // 遍历输入
        for(int i = 0; i < scores.length; i++){
            System.out.print("请输入第" + (i+1) + "个评委的分数：");
            scores[i] = input.nextInt();
            sum += scores[i];
        }

        // 另一个循环，遍历输出
        System.out.println(scores.length + "个评委的分数如下：");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + "  ");
        }
        // 输出换行
        System.out.println();

        // 找出最大值
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if(scores[i] > max){
                max = scores[i];
            }
        }
        System.out.println("max = " + max);

        // 找出最小值
        int min = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if(scores[i] < min){
                min = scores[i];
            }
        }
        System.out.println("min = " + min);

        //最后得分:去掉一个最高分和一个最低分后其余8位评委打分的平均值
        System.out.println("该选手的最后得分：" + (double)((sum-max-min)/scores.length));
    }
}
