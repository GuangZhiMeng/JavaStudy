public class MathDemo {
    public static void main(String[] args) {

//      public static int abs(int a) ���ز����ľ���ֵ
        int abs = Math.abs(-10);//10
        System.out.println(abs);

//      public static double ceil(double a) ����ȡ��
        double ceil = Math.ceil(10.1); // 11.0
        System.out.println(ceil);

//      public static double floor(double a) ����ȡ��
        double floor = Math.floor(10.9); // 10.0
        System.out.println(floor);

//      public static int round(float a) ��������
        long round = Math.round(10.1); // 10
        System.out.println(round);
        long round1 = Math.round(10.6); // 11
        System.out.println(round1);

//      public static int max(int a,int b) ��������intֵ�еĽϴ�ֵ
        int max = Math.max(10,20); // 20
        System.out.println(max);

//      public static int min(int a,int b) ��������intֵ�еĽ�Сֵ
        int min = Math.min(10,20); // 10
        System.out.println(min);

//      public static double pow(double a,double b) ����a��b���ݵ�ֵ
        double pow = Math.pow(2,3); // 8.0 2�����η�
        System.out.println(pow);

//      public static double random() ����ֵΪdouble����ֵ��[0.0,1.0)
        double random = Math.random();
        System.out.println(random);

    }
}
