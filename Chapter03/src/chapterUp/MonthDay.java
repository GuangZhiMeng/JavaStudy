package chapterUp;

import java.util.Scanner;

public class MonthDay {
    public static void main(String[] args) {
        /*
    �Ӽ���������ݡ�ѭ���������12����ÿ���µ�������
     */
        Scanner input = new Scanner(System.in);
        System.out.println("��������ݣ�");
        int year = input.nextInt();

        for(int month=1; month<=12; month++){
            if(month == 1 || month==3 ||month==5 ||month==7 ||month==8 ||month==10 ||month==12){
                System.out.println(month + "��31��");
            }else if(month==4 || month==6 ||month==9 ||month==11){
                System.out.println(month + "��30��");
            }else{//month==2
                //�ж��Ƿ�Ϊ����
                if(year%4==0 && year%100!=0 || year%400==0){
                    System.out.println(month + "��29��");
                }else{
                    System.out.println(month + "��28��");
                }
            }
        }
        input.close();
    }
}
