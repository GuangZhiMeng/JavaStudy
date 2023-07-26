package tiaojianYSF;

import java.util.Scanner;

public class JieFangCheng {
    public static void main(String[] args) {
        /*
        求ax<sup>2</sup>+bx+c=0方程的根，其中a,b,c分别为函数的参数。
        如果a≠0，那么：
        （1）当b<sup>2</sup>-4ac>0，则一元二次方程有两个实数解：
        （2）当b<sup>2</sup>-4ac=0，则一元二次方程有一个实数解：
        （3）当b<sup>2</sup>-4ac<0，则一元二次方程在实数范围内无解；
        如果a=0,b≠0，那么一元一次方程有一个解：
        如果a=0,b=0，那么参数输入有误，该式子不是方程。
        提示1：Math.sqrt(num);  sqrt指平方根
        例如：
        求x<sup>2</sup>-4x+1=0方程的根
        求x<sup>2</sup>-2x+1=0方程的根
         */
        //先输入a，b，c三个函数的参数
        Scanner input = new Scanner(System.in);
        System.out.println("请输入方程：ax的平方 + bx + c = 0的三个参数：");
        System.out.print("a：");
        double a = input.nextDouble();

        System.out.print("b：");
        double b = input.nextDouble();

        System.out.print("c：");
        double c = input.nextDouble();
        input.close();

        //根据参数的不同求方程的解
        if(a!=0){
            double d = b * b - 4 * a * c;
            if(d > 0){
                double X1 = (-b + Math.sqrt(d)) / (2 * a);
                double X2 = (-b - Math.sqrt(d)) / (2 * a);

                System.out.println("这个一元二次方程有两个根：" + X1 + "," + X2);
            }else if(d == 0){
                double X = -b / (2 * a);
                System.out.println("方程有一个实数解：" + X);
            }else{//d<0
                System.out.println("一元二次方程在实数范围内无解");
            }
        }else{// a == 0
            if(b!=0){
                double X = -c / b;
                System.out.println("一元一次方程的根：" + X);
            }else{
                System.out.println("输入有误，a,b,c的值不能构成一个方程");
            }
        }
}
}