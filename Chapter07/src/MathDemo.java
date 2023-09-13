public class MathDemo {
    public static void main(String[] args) {

//      public static int abs(int a) 返回参数的绝对值
        int abs = Math.abs(-10);//10
        System.out.println(abs);

//      public static double ceil(double a) 向上取整
        double ceil = Math.ceil(10.1); // 11.0
        System.out.println(ceil);

//      public static double floor(double a) 向下取整
        double floor = Math.floor(10.9); // 10.0
        System.out.println(floor);

//      public static int round(float a) 四舍五入
        long round = Math.round(10.1); // 10
        System.out.println(round);
        long round1 = Math.round(10.6); // 11
        System.out.println(round1);

//      public static int max(int a,int b) 返回两个int值中的较大值
        int max = Math.max(10,20); // 20
        System.out.println(max);

//      public static int min(int a,int b) 返回两个int值中的较小值
        int min = Math.min(10,20); // 10
        System.out.println(min);

//      public static double pow(double a,double b) 返回a的b次幂的值
        double pow = Math.pow(2,3); // 8.0 2的三次方
        System.out.println(pow);

//      public static double random() 返回值为double的正值，[0.0,1.0)
        double random = Math.random();
        System.out.println(random);

    }
}
