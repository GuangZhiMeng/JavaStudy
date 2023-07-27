package ShuZu;
import java.util.Scanner;

public class PingWeiDaFeng2 {
    public static void main(String[] args) {
        //声明一个数组，长度为10，用来存储分数
        int[] scores = new int[10];

        Scanner input = new Scanner(System.in);
        int max = 0;
        int min = 100;// 分数范围[0,100)
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            System.out.print("请输入第" + (i+1) + "个评委的分数：");
            scores[i] = input.nextInt();
            sum += scores[i];

            if(scores[i] > max){
                max = scores[i];
            }
            if(scores[i] < min){
                min = scores[i];
            }
        }

        // 另一个循环，遍历输出
        System.out.println(scores.length + "个评委的分数如下：");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + "  ");
        }
        // 输出换行
        System.out.println();

        System.out.println("最高分：" + max);
        System.out.println("最低分：" + min);
        System.out.println("平均分：" + (double)(sum-max-min)/(scores.length-2));
    }
}
