package DuoTai.test3;

public class DuoTaiHaoChu {
    public static void main(String[] args) {
        useAnimal(new Dog());
        useAnimal(new Cat());
    }

    // �������õ����������
    private static void useAnimal(Animal a) { // Animal a = new Dog();
                                             //  Animal a = new Cat();
        a.eat();
    }
}


// ������Animal
abstract class Animal{
    public abstract void eat();
}

class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("������");
    }
}

class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("è����");
    }
}

