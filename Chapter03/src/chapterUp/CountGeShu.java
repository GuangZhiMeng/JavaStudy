package chapterUp;

import java.util.Scanner;

public class CountGeShu {
    public static void main(String[] args) {
        /*
        �Ӽ��������������ж����������Ǹ���������0������
        ��ͳ�������͸����ĸ�����
         */

        //�Ӽ�����������
        Scanner input = new Scanner(System.in);

        //��ͳ�������͸����ĸ���
        int positive = 0;
        int negative = 0;
        while(true){
            System.out.println("������������");
            int num = input.nextInt();

            if(num==0){//����0����
                break;
            }else if(num > 0){
                positive++;
            }else{
                negative++;
            }
        }

        System.out.println("������" + positive);
        System.out.println("������" + negative);
        input.close();
    }
}
