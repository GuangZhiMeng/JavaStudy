package ShuZu;

import java.util.Scanner;

public class ArrayWeek {
    public static void main(String[] args) {
        /*
        用一个数组，保存星期一到星期天的7个英语单词，从键盘输入1-7，显示对应的单词
         */
        String[] weekname = new String[]{"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("请输入星期值[1,7]：");
            int weekValue = input.nextInt();

        /*
        weekValue = 1,输出Monday，weekname[0]
        weekValue = 2,输出Tuesday，weekname[1]
        ……
         */
            if(weekValue >= 1 && weekValue <= 7) {
                System.out.println(weekValue + "对应的单词是：" + weekname[weekValue - 1]);
                break;
            }else{
                System.out.println("输入有误！");
            }
        }
        input.close();
    }
}
