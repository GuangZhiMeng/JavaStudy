package chapterUp;

import java.util.Scanner;

public class CountDay {
    public static void main(String[] args) {
//        用year、month、day分别存储今天的年、月、日值，然后输出今天是这一年的第几天。
//        注：判断年份是否是闰年的两个标准，满足其一即可
//       1）可以被4整除，但不可被100整除
//       2）可以被400整除
//        例如：1900，2200等能被4整除，但同时能被100整除，但不能被400整除，不是闰年
        Scanner input = new Scanner(System.in);
        System.out.print("请输入年：");
        int year = input.nextInt();

        System.out.print("请输入月：");
        int month = input.nextInt();

        System.out.print("请输入日：");
        int day = input.nextInt();

        /*
       累加总天数
       1，3,5,7,8,10，12是31天
       4,6,9,11是30天
       2有28或29天
        */

        //定义一个变量用来存储总天数
        int days = day;

        switch(month){
            case 12:
                days += 30;//30代表11月份的总天数
            case 11:
                days += 31;//31代表10月份的总天数
            case 10:
                days += 30;//31代表9月份的总天数
            case 9:
                days += 31;//31代表8月份的总天数
            case 8:
                days += 31;//31代表7月份的总天数
            case 7:
                days += 30;//31代表6月份的总天数
            case 6:
                days += 31;//31代表5月份的总天数
            case 5:
                days += 30;//31代表4月份的总天数
            case 4:
                days += 31;//31代表3月份的总天数
            case 3:
                days += 28;//28代表2月份的总天数
                if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                    days++;
                }
            case 2:
                days += 31;//31代表1月份的总天数
        }
        System.out.println(year + "年" + month + "月" + day + "日是这一年的第" + days + "天");
    }
}
