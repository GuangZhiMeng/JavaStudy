package Random;
import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        //�������100���ڵ������������
        //�������Math.random()
        // double num = Math.random(); // [0,1)��С��

        // 1.׼��Random ��Scanner���󣬷ֱ����ڲ���������ͼ���¼��
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        // 2.ʹ��Random����һ��1~100֮���������ΪҪ�µ���
        int randNum = (int)(Math.random() * 100);
        //int randNum = r.nextInt(100) + 1;
        //int randNum = (int)(Math.random(100) + 1);

        // 3.ѭ������
        int cnt = 0;
        while(true){
            // 4.����¼���û��µ�����
            System.out.println("���������µ����ݣ�");
            int num = sc.nextInt();
            System.out.println(randNum);//��ʾ�����
            cnt++;

            // 5.ʹ���û�¼������ݺ���������бȽϣ���������ʾ
            if (num > randNum){
                System.out.println("�´���");
            }else if (num < randNum) {
                System.out.println("��С��");
            }else{
                // 6.�¶�֮��break������������ѭ����
                if(cnt < 5){
                    System.out.printf("��ϲ��,ֻ����%d�ξͲ¶���\n",cnt);
                }else{
                    System.out.printf("��ϲ��¶��ˣ�����%d��\n",cnt);
                }
                break;
            }
        }
        System.out.println("��л����ʹ��");
    }
}

