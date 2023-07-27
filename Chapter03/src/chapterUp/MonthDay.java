package chapterUp;

import java.util.Scanner;

public class MonthDay {
    public static void main(String[] args) {
        /*
    从键盘输入年份。循环输出这年12个月每个月的总天数
     */
        Scanner input = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = input.nextInt();

        for(int month=1; month<=12; month++){
            if(month == 1 || month==3 ||month==5 ||month==7 ||month==8 ||month==10 ||month==12){
                System.out.println(month + "：31天");
            }else if(month==4 || month==6 ||month==9 ||month==11){
                System.out.println(month + "：30天");
            }else{//month==2
                //判断是否为闰年
                if(year%4==0 && year%100!=0 || year%400==0){
                    System.out.println(month + "：29天");
                }else{
                    System.out.println(month + "：28天");
                }
            }
        }
        input.close();
    }
}
