package ShuZuPractice;

import java.util.Scanner;

/*
3������Ԫ�صĲ���
��1��˳����ң������Ԫ�ذ�����Ŀ�����ȶԣ������ȣ��ͱ�ʾ�ҵ��ˣ�����Ԫ�ض����ȣ�����û�ҵ�
 */
public class BasicCountFind {
    public static void main(String[] args) {
        //�������10��Ԫ��[0,100)���Ӽ�������һ��ֵ�������Ƿ���Ԫ���б���
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100);
        }

        Scanner input = new Scanner(System.in);
        System.out.println("��������Ҫ���ҵ�����");
        int target = input.nextInt();
        
        //˳�����
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                System.out.println("�±��ǣ�[" + i + "]");
                flag = true;
            }
        }
        if(!flag){
            System.out.println("������");
        }

        // ��ʾһ��Ԫ��
        System.out.println("10��Ԫ���ǣ�");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
