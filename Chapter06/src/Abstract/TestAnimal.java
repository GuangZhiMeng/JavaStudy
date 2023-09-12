package Abstract;

public class TestAnimal {
    public static void main(String[] args) {
        // 创建狗类对象，调用狗类方法
        Dog d = new Dog();
        d.eat();
        d.drink();

        // 创建猫类对象，调用猫类方法
        Cat c = new Cat();
        c.eat();
        c.drink();
    }
}
