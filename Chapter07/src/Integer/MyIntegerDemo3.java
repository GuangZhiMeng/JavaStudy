package Integer;

public class MyIntegerDemo3 {
    public static void main(String[] args) {
        String s1 = "100";
        int i1 = 200;
        System.out.println(s1 + i1);// 100200 --- �ַ���+������������ �������һ���ַ���

        int i2 = Integer.parseInt(s1);// ���Խ��ַ������͵��������int���͵�����
        System.out.println(i2 + i1);

        // int ---> String
        // ��ʽһ��+ ""
        int i3 = 100;
        String s2 = i3 + "";
        System.out.println(s2 + 100);//100100

        // ��ʽ�������Ե���String���е�valueof����
        String s3 = String.valueOf(i3);
        System.out.println(s3 + 100);//100100
    }
}
