package DuoTai.test3;

public class DuoTaiHaoChu {
    public static void main(String[] args) {
        useAnimal(new Dog());
        useAnimal(new Cat());
    }

    // 父类引用调用子类对象
    private static void useAnimal(Animal a) { // Animal a = new Dog();
                                             //  Animal a = new Cat();
        a.eat();
    }
}


// 抽象类Animal
abstract class Animal{
    public abstract void eat();
}

class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("狗吃肉");
    }
}

class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}

