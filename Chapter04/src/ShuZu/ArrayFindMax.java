package ShuZu;

import java.util.Scanner;

/*
�ȴӼ�������С��������Ȼ�������������飬һ���洢����ѧԱ������һ���洢����ѧԱ�ɼ���
�ٴӼ�������ÿһ��ѧԱ�������ͳɼ���������ʾС����ÿһ��ѧԱ�������ͷ����������ʾ��߷�ͬѧ�������ͳɼ���
 */
public class ArrayFindMax {
    public static void main(String[] args) {
        //�ȴӼ�������С������
        Scanner input = new Scanner(System.in);
        System.out.println("������С��������");
        int count = input.nextInt();

        //������������һ���洢����ѧԱ������һ���洢����ѧԱ�ɼ�
        String[] Names = new String[count];
        int[] grades = new int[count];

        //������ʾС����ÿһ��ѧԱ�������ͷ���
        for (int i = 0; i < count; i++) {
            System.out.print("�������" + (i+1) + "��ѧԱ��������");
            //�����Ԫ���൱���Ǳ��������Կ����ظ���ֵ
            Names[i] = input.next();
            System.out.print("��������/���ķ�����");
            grades[i] = input.nextInt();
        }

        //��ʾѧԱ�������ͷ���
        System.out.println("����ѧԱ�У�");
        for (int i = 0; i < count; i++) {
            System.out.print(Names[i] + ":");
            System.out.print(grades[i] + "\n");
        }

        //�ҳ����ֵ
        int max = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if(grades[i] > max){
                max = grades[i];
            }
        }
        //��ʾ��߷�ͬѧ�������ͳɼ���
        //String result = "";
        System.out.println("������߷ֵ��ǣ�");
        for (int i = 0; i < grades.length; i++) {
            if(grades[i] == max){
                System.out.println(Names[i]);
                System.out.println("��/���ĳɼ��ǣ�"+ max);
            }
            /*
               if(scores[i] == max){
                    result += names[i] + "  ";
               }
             */
        }
//        System.out.println("��߷֣�" + max);
//        System.out.println("��߷�������" + result);
    }
}
