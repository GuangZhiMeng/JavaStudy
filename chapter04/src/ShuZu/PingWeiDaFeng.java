package ShuZu;

import java.util.Scanner;
/*
��10����ί���μӱ�̱�����ĳ��ѡ�ֵ���Ʒ��֣��Ӽ�������10����ί�ķ��������洢��һά�����С�
Ȼ����ѡ�ֵ����÷֣�ȥ��һ����߷ֺ�һ����ͷֺ�����8λ��ί��ֵ�ƽ��ֵ��
 */
public class PingWeiDaFeng {
    public static void main(String[] args) {
        //�Ӽ�������10����ί�ķ���
        int[] scores = new int[10];//��̬����Ķ���
        int sum = 0;//����ɼ��ܺ�
        Scanner input = new Scanner(System.in);
        // ��������
        for(int i = 0; i < scores.length; i++){
            System.out.print("�������" + (i+1) + "����ί�ķ�����");
            scores[i] = input.nextInt();
            sum += scores[i];
        }

        // ��һ��ѭ�����������
        System.out.println(scores.length + "����ί�ķ������£�");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + "  ");
        }
        // �������
        System.out.println();

        // �ҳ����ֵ
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if(scores[i] > max){
                max = scores[i];
            }
        }
        System.out.println("max = " + max);

        // �ҳ���Сֵ
        int min = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if(scores[i] < min){
                min = scores[i];
            }
        }
        System.out.println("min = " + min);

        //���÷�:ȥ��һ����߷ֺ�һ����ͷֺ�����8λ��ί��ֵ�ƽ��ֵ
        System.out.println("��ѡ�ֵ����÷֣�" + (double)((sum-max-min)/scores.length));
    }
}
