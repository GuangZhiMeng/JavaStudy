package chapterUp;

import java.util.Scanner;

public class CommonDivisor {
    public static void main(String[] args) {
        //��������������m��n���������Լ������С������
        //��Լ�����ǿ��Ա�ͬһ���������ģ�����2��3��4��12�Ĺ�Լ����
        //���������ǿ�������ĳЩ����������Щ���Ĺ�������36��2��3��4��6�Ĺ�������

        //��Լ����[1,m|n]�ܹ�ͬʱ��m��n������������
        //����������ͬʱ��m��n��������
        //����
        Scanner input = new Scanner(System.in);
        System.out.print("������һ��������m��");
        int m = input.nextInt();
        System.out.print("������һ��������n��");
        int n = input.nextInt();

        //�����Ż�
        /*
        ���裺m = 12��n = 28 ��28->1�����ж�
        ��[12,28]�ǲ����������ǵĹ�Լ�������������Χ����Ҫ��
        ����ܹ���[12->1]��Χ�ң�����
        ���Ч�ʣ���ȷ��m��n�Ĵ�С��ϵ
        ��[m��n��С���Ǹ�����ʼ->1]�ң��ҵ��ĵ�һ����Լ���������ǵ����Լ��
         */
    int max = m > n ? m : n;
    int min = m < n ? m : n;
    for(int i=min;i>=1;i--){
        if(m%i==0 && n%i==0){
            System.out.println(i + "�����ǵ����Լ��");
    //        System.out.println(m*n/i + "�����ǵ���С������");
            break;
        }
    }

    for(int i=max;i<=m*n;i++){
        if(i%m==0 && i%n==0){
            System.out.println(i + "�����ǵ���С������");
            break;
        }
    }
    input.close();
    }
}
