package string;

public class Demo1String {
    public static void main(String[] args) {
        // public String() : ����һ���հ��ַ������󣬲������κ�����
        String s1 = new String();
        System.out.println(s1);

        // public String(char[] chs) : �����ַ���������ݣ��������ַ�������
        char[] chs = {'a','b','c'};
        String s2 = new String(chs);//�ַ����ַ����ַ����ɵĴ�
        System.out.println(s2);//abc

        // public String(String original) : ���ݴ�����ַ������ݣ��������ַ�������
        String s3 = new String("123");
        System.out.println(s3);
    }
}
