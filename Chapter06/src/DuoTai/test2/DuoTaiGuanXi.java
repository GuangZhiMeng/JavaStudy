package DuoTai.test2;

public class DuoTaiGuanXi {
    /*
        多态的前提和体现
            有继承/实现关系
            有方法重写
            有父类引用指向子类对象
     */
    public static void main(String[] args) {
        // 有父类引用指向子类对象
        Fu f = new Zi();
    }
}

class Fu{
    int num = 10;

    public void method(){
        System.out.println("Fu……method");
    }
}

class Zi extends Fu{
    int num = 20;
    @Override
    public void method(){
        System.out.println("Zi……method");
    }
}