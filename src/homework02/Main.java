package homework02;

//在main函数中分别调用不带参数的构造方法Person，Person(String name)，Person(String name,int age)创建类对象
public class Main {
    public static void main(String[] args) {
        //创建一个不带参数的Person对象
        Person p1 = new Person();
        //创建一个带一个String参数的Person对象
        Person p2 = new Person("小光");
        //创建一个带两个参数的Person对象
        Person p3 = new Person("李华", 19);
        //打印每个对象的信息
        p1.printInfo();
        p2.printInfo();
        p3.printInfo();
    }
}