package homework01;

//声明一个Dog类
public class Dog {
    /*
    1.声明一个Dog类，给Dog类添加三个String类型的属性，分别是name，color，variety ，
    定义两个方法，分别是，eat，run。
2.在main方法中创建一个名为wuhuarou的Dog对象，并设置name为五花肉，color为棕色，variety为阿拉斯加。
3.使得调用wuhuarou对象的eat方法能输出啃骨头，调用run方法能输出叼着骨头跑。
     */

    //给Dog类添加三个String类型的属性
    String name;
    String color;
    String variety;

    //定义两个方法，分别是，eat，run
    //eat方法输出啃骨头
    void eat(){
        System.out.println("啃骨头");
    }

    //run方法输出叼着骨头跑
    void run(){
        System.out.println("叼着骨头跑");
    }
}

    //在main方法中创建一个名为wuhuarou的Dog对象，并设置name为五花肉，color为棕色，variety为阿拉斯加
class Main {
    public static void main(String[] args) {
        Dog wuhuarou = new Dog();
        wuhuarou.name = "五花肉";
        wuhuarou.color = "棕色";
        wuhuarou.variety = "阿拉斯加";

        //使得调用wuhuarou对象的eat方法能输出啃骨头，调用run方法能输出叼着骨头跑
        wuhuarou.eat();
        wuhuarou.run();
    }
}