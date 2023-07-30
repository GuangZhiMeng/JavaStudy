package study;

//类开始
public class CircleArea {
    private float fRadius;          //成员变量
    final float PI = 3.14f;         //定义常变量 PI

    //方法：设置圆半径
    void setRadius(float fR){
        fRadius = PI;
    }

    //这里添加了一个带返回值的方法getArea（）
    float getArea(){
        return fRadius * fRadius * PI;
    }

    //方法：显示圆面积
    void showArea(){
        System.out.println("The area of circle is " + getArea());
    }

    //主方法，即程序的入口
    public static void main(String[] args){
        //创建圆类对象
        Circle circle = new Circle();

        //引用对象方法，设置圆半径
        circle.setRadius(5);

        //引用对象方法，显示圆面积
        circle.showArea();
    }
}
