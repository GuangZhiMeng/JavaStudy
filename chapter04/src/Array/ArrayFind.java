package Array;

import java.util.Scanner;

public class ArrayFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //����һ�����飬�þ�̬��ʼ���������Ԫ�صĳ�ʼ��
        int[] arr = new int[] {19,28,37,46,55,66};
        
        System.out.println("��������Ҫ���ҵ�Ԫ�أ�");
        //����¼��Ҫ���ҵ�����,��һ����������
        int num = sc.nextInt();

        //����һ��������������ʼֵΪ-1
        int index = -1;
        //��������
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]){//�ü���¼������ݺ������е�ÿһ��Ԫ�ؽ��бȽ�
                index = i;//���ֵ��ͬ,�ͰѸ�ֵ��Ӧ��������ֵ����������,������ѭ��
                break;
            }
        }
        //�������ֵ
        System.out.println(index);
    }
}
