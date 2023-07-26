package Array;

import java.util.Scanner;//导包

public class PingWeiDaFen {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //动态初始化定义一个长度为6的数组,用来存储分数
        int[] q = new int[6];

        //定义一个变量，用来保存输入成绩的总和
        int sum = 0;

        //遍历输入
        for (int i = 0; i < q.length; i++) {
            System.out.println("请输入" + (i+1) + "号评委给出的分数：");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100){//分数为 0-100 的整数分
                q[i] = score;//满足条件，则录入
            }else {
                System.out.println("您输入的分数有误，请检查是否是0~100之间的数");
                i--;//如果输入有误，不满足条件，则重新输入该评委的打分
            }
            sum += q[i];//计算求和
        }

        // 另一个循环，遍历输出
        System.out.println(q.length + "个评委的分数如下：");
        for (int i = 0; i < q.length; i++) {
            System.out.print(q[i] + "  ");
        }
        // 输出换行
        System.out.println();

        //找出数组的最大值
        int max = q[0];
        for (int i = 0; i < q.length; i++) {
            if (q[i] > max){
                max = q[i];
            }
        }

        //找出数组的最小值
        int min = q[0];
        for (int i = 0; i < q.length; i++) {
            if (q[i] < min){
                min = q[i];
            }
        }

        //输出最大值与最小值
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        //最后得分:去掉一个最高分和一个最低分后其余4位评委打分的平均值
        System.out.println("该选手最终的分数：" + (double)(sum - max - min)/4);
        //(double)(sum - max - min)/q.length - 2
    }
}
