package Random;

import java.util.Random;

public class Random1 {
    public static void main(String[] args) {
        /*
        Random�����������
        1.������import java.util.Random;
        ע���������Ķ�������������ඨ�������
        2.��������Random r = new Random();
        ע��ֻ�б����� r ���Ա䣬�����Ķ��������
        3.��ȡ�������int number = r.nextInt(10);
        ע����ȡ���ݵķ�Χ��[0,10) number��10���Ա䣬����������
         */

        //��������
        Random r = new Random();

        //��ȡ10�������
        for (int i = 0; i <= 10; i++) {
            //��ȡ�����
            int num = r.nextInt(10) + 1;//1~10
            System.out.printf("%d ",num);
        }
     }
}
