package tiaojianYSF;

import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {
        /*
        赌数游戏：随机产生3个1-6的整数，如果三个数相等，那么称为“王”，如果三个数之和大于9，
        称为“大”，如果三个数之和小于等于9，称为“小”，用户从键盘输入押的是“王”、“大”、“小”，并判断是否猜对了
提示：随机数  Math.random()产生 [0,1)范围内的小数
         */

        //从键盘输入
        Scanner input = new Scanner(System.in);
        System.out.println("请押宝（豹子，大，小）：");
        String ya = input.next();
        input.close();

        //产生随机数
        int num1 = (int) (Math.random() * 6 + 1);
        int num2 = (int) (Math.random() * 6 + 1);
        int num3 = (int) (Math.random() * 6 + 1);

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);

        boolean result = false;
        //switch支持String类型
        switch (ya){
            case "豹子": result = num1 == num2 && num2 == num3; break;
            case "大": result = num1 + num2 + num3 > 9; break;
            case "小": result = num1 + num2 + num3 <= 9; break;
            default:System.out.println("输入有误！");
        }

        System.out.println("num1,num2,num3分别是：" + num1 +"," + num2 +"," + num3 );
        System.out.println(result ? "猜中了" : "猜错了");
    }
}
