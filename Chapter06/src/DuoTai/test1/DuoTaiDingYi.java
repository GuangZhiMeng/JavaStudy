package DuoTai.test1;

public class DuoTaiDingYi {
    /*
        多态的前提和体现
            有继承/实现关系
            有方法重写
            有父类引用指向子类对象
     */
    public static void main(String[] args){
        // 3.有父类引用指向子类对象
        // 当前事物，是一只动物
        // 多态
        Animal a = new Cat();

        // 直接创建子类对象
        // 当前事物，是一只猫
        Cat c = new Cat();
    }
}

// 1.有继承/实现关系
class Animal{
    public void eat(){
        System.out.println("动物吃饭");
    }
}

// 2.有方法重写
class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }
}