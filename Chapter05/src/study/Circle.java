package study;

public class Circle {           //类开始
    private float fRadius;      //成员变量
    final float PI = 3.14f;     //定义常量PI

    //方法：设置圆半径
    void setRadius(float fR){
        fRadius = fR;
    }

    //方法：显示圆面积
    void showArea(){
        System.out.println("The area of circle is " + fRadius * fRadius * PI);
    }

    //主方法，即程序的入口
    public static void main(String[] args){
        //创建圆类的对象
        Circle circle = new Circle();

        //引用对象方法，设置圆半径
        circle.setRadius(5);

        //引用对象方法，显示圆面积
        circle.showArea();
    }
}
