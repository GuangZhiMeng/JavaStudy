package String;

import java.util.Scanner;

public class StringIntercept {
    public static void main(String[] args) {
        // ����¼��
        Scanner sc = new Scanner(System.in);
        System.out.println("�������ֻ��ţ�");
        String telString = sc.nextLine();

        // ��ȡ�ַ���ǰ��λ
        String start = telString.substring(0,3);

        // ��ȡ�ַ�������λ
        String end = telString.substring(7);

        // ����ȡ��������ַ������м����* * * * ����ƴ�ӣ�������
        System.out.println(start + "****" + end);
    }
}
