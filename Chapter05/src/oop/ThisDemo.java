package oop;

public class ThisDemo {
    /*
        成员变量和局部变量重名的情况，java使用的是就近原则
        如果非要使用成员变量需要使用this关键字来进行区分
        this关键字可以解决局部变量和成员变量的重名问题
     */
    public static void main(String[] args) {
        //创建一个对象
        Mthis stu = new Mthis();

        stu.name = "菠萝吹雪";
        stu.sayhello("陈留香");
    }
}
