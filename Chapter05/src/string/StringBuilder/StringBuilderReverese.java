package string.StringBuilder;

import java.util.Scanner;

public class StringBuilderReverese {
    public static void main(String[] args) {
        // ��������һ���ַ���
        Scanner sc = new Scanner(System.in);
        System.out.println("������Գ��ַ�����");
        String s = sc.nextLine();

        // ������¼����ַ�����ת
        // ���ַ�����װΪStringBuilder������Ϊ�˵����䷴ת�ķ���
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();

        // s:String  sb:StringBuilder
        // ���Ͳ�һ���޷����бȽ�
        String reverseStr = sb.toString();

        //ʹ�÷�ת����ַ�������ԭ�ַ������бȶ�
        if (s.equals(reverseStr)){
            System.out.println("�ǶԳ��ַ���");
        }else {
            System.out.println("���ǶԳ��ַ���");
        }

    }
}
