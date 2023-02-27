package java01.idea;

class Dog {
    //实例变量
    int size;
    String breed;
    String name;

    void bark(){      //方法
        System.out.println("Ruff! Ruff！");
    }
}

//编写测试用的类
class DogTestDrive{
    public static void main(String[] args){
        // Dog 测试码
        //建立dog对象  存取该对象的变量
        Dog d = new Dog();

        //调用它的方法
        // .圆点运算符
        d.size = 40;
        d.bark();
    }
}
