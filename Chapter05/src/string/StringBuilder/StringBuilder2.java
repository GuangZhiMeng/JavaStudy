package string.StringBuilder;

public class StringBuilder2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        //��ʽ��̣� ���һ���������ص��Ƕ������ͣ�����Ϳ��Լ������µ��÷���.
        sb.append("��ɫ").append("��ɫ").append("��ɫ");

        //public int length()�����س��ȣ��ַ����ֵĸ�����
        System.out.println("sb���ַ����ĸ���Ϊ��" + sb.length());
    }
}
