package Integer;

public class MyIntegerDemo1 {
    public static void main(String[] args) {
//        public Integer(int   value)             | ���� int ֵ���� Integer ����(��ʱ)
//|       public Integer(String s)                | ���� String ֵ���� Integer ����(��ʱ)

//|       public static Integer valueOf(int i)    | ���ر�ʾָ���� int ֵ�� Integer   ʵ��
//|       public static Integer valueOf(String s) | ����һ������ָ��ֵ�� Integer ���� String
        Integer i1 = Integer.valueOf(200);
        Integer i2 = Integer.valueOf("200");
        System.out.println(i1);
        System.out.println(i2);
    }
}
