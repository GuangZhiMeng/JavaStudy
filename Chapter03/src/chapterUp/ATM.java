package chapterUp;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
//        ��������balance����ʼ��Ϊ0�����Ա�ʾ�����˻���������ͨ��ATM������ʵ�ִ�ȡ��ȹ��ܡ�
//        ---------ATM-------
//          1�����
//          2��ȡ��
//          3����ʾ���
//          4���˳�
//        ��ѡ��

        double balance = 0.0;//��ʾ���
        Scanner input = new Scanner(System.in);
        int num;
        do {
            System.out.println("---------ATM-------");
            System.out.println("\t1�����");
            System.out.println("\t2��ȡ��");
            System.out.println("\t3����ʾ���");
            System.out.println("\t4���˳�");
            System.out.println("��ѡ��");
            num = input.nextInt();

            switch(num){
                case 1:
                    System.out.println("���������");
                    double money = input.nextDouble();
                    balance += money;
                    break;//����switch,����do while
                case 2:
                    System.out.println("������ȡ���");
                    money = input.nextDouble();
                    balance -= money;
                    break;//����switch,����do while
                case 3:
                    System.out.println("��" + balance);
                    break;
            }
        }while(num != 4);
        input.close();
    }
}
