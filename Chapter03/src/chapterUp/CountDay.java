package chapterUp;

import java.util.Scanner;

public class CountDay {
    public static void main(String[] args) {
//        ��year��month��day�ֱ�洢������ꡢ�¡���ֵ��Ȼ�������������һ��ĵڼ��졣
//        ע���ж�����Ƿ��������������׼��������һ����
//       1�����Ա�4�����������ɱ�100����
//       2�����Ա�400����
//        ���磺1900��2200���ܱ�4��������ͬʱ�ܱ�100�����������ܱ�400��������������
        Scanner input = new Scanner(System.in);
        System.out.print("�������꣺");
        int year = input.nextInt();

        System.out.print("�������£�");
        int month = input.nextInt();

        System.out.print("�������գ�");
        int day = input.nextInt();

        /*
       �ۼ�������
       1��3,5,7,8,10��12��31��
       4,6,9,11��30��
       2��28��29��
        */

        //����һ�����������洢������
        int days = day;

        switch(month){
            case 12:
                days += 30;//30����11�·ݵ�������
            case 11:
                days += 31;//31����10�·ݵ�������
            case 10:
                days += 30;//31����9�·ݵ�������
            case 9:
                days += 31;//31����8�·ݵ�������
            case 8:
                days += 31;//31����7�·ݵ�������
            case 7:
                days += 30;//31����6�·ݵ�������
            case 6:
                days += 31;//31����5�·ݵ�������
            case 5:
                days += 30;//31����4�·ݵ�������
            case 4:
                days += 31;//31����3�·ݵ�������
            case 3:
                days += 28;//28����2�·ݵ�������
                if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                    days++;
                }
            case 2:
                days += 31;//31����1�·ݵ�������
        }
        System.out.println(year + "��" + month + "��" + day + "������һ��ĵ�" + days + "��");
    }
}
