package Array;

import java.util.Scanner;//����

public class PingWeiDaFen {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //��̬��ʼ������һ������Ϊ6������,�����洢����
        int[] q = new int[6];

        //����һ��������������������ɼ����ܺ�
        int sum = 0;

        //��������
        for (int i = 0; i < q.length; i++) {
            System.out.println("������" + (i+1) + "����ί�����ķ�����");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100){//����Ϊ 0-100 ��������
                q[i] = score;//������������¼��
            }else {
                System.out.println("������ķ������������Ƿ���0~100֮�����");
                i--;//����������󣬲������������������������ί�Ĵ��
            }
            sum += q[i];//�������
        }

        // ��һ��ѭ�����������
        System.out.println(q.length + "����ί�ķ������£�");
        for (int i = 0; i < q.length; i++) {
            System.out.print(q[i] + "  ");
        }
        // �������
        System.out.println();

        //�ҳ���������ֵ
        int max = q[0];
        for (int i = 0; i < q.length; i++) {
            if (q[i] > max){
                max = q[i];
            }
        }

        //�ҳ��������Сֵ
        int min = q[0];
        for (int i = 0; i < q.length; i++) {
            if (q[i] < min){
                min = q[i];
            }
        }

        //������ֵ����Сֵ
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        //���÷�:ȥ��һ����߷ֺ�һ����ͷֺ�����4λ��ί��ֵ�ƽ��ֵ
        System.out.println("��ѡ�����յķ�����" + (double)(sum - max - min)/4);
        //(double)(sum - max - min)/q.length - 2
    }
}
