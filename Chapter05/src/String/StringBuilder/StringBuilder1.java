package String.StringBuilder;

public class StringBuilder1 {
    public static void main(String[] args) {
        // public StringBuilder():����һ���հ׿ɱ��ַ������󣬲������κ�����
        StringBuilder sb = new StringBuilder();//��ʾ�����ǿյ�
        System.out.println(sb);

        // public StringBuilder(String   str):�����ַ��������ݣ��������ɱ��ַ�������
        StringBuilder sb2 = new StringBuilder("abc");// �����㴫����ַ��������������ɱ���ַ���
        // ��ʾ�����մ�����������㴫�������
        System.out.println(sb2);
    }
}
