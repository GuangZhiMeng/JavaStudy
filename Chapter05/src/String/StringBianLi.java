package String;

import java.util.Scanner;

public class StringBianLi {
    public static void main(String[] args) {
        // ����¼��һ���ַ������� Scanner ʵ��
        Scanner sc = new Scanner(System.in);
        System.out.println("������Ҫ�������ַ�����");
        String str = sc.nextLine();

        // ���ַ�����ֳ��ַ�����
        char[] chars = str.toCharArray();

        // �����ַ�����
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }
}
