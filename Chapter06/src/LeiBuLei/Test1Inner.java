package LeiBuLei;

public class Test1Inner {
    /*
        调用接口中的方法
        1. 创建该接口的实现类，通过implements 关键字去实现接口
        2. 重写方法
        3. 创建实现类对象
        4. 调用重写后的方法

        使用匿名内部类来调用接口中的方法
        匿名内部类
        前提：需要存在类/接口
        格式：
            new 类名\接口名(){
                重写方法
            }
     */

    public static void main(String[] args) {
        // 创建接口实现类的对象，调用接口中的方法
        InterImpl li = new InterImpl();
        li.show();

        // 使用匿名内部类
        // 匿名内部类的理解：将继承\实现，方法重写，创建对象，放在了一步进行
        // 以下代码是：实现了Inter接口的，一个实现类对象
        // 对象可以调方法，所以在最后有一个 .show()
        new Inter(){
            @Override
            public void show() {
                System.out.println("匿名内部类中的show方法");
            }
        }.show();


        // 情况：当前接口中存在多个方法，用原来的调用不能同时调用多个方法
        // 解决办法：父类引用调用子类对象
        // 以多态的引用来实现
        Inter2 i = new Inter2(){
            @Override
            public void show1() {
                System.out.println("show1...");
            }

            @Override
            public void show2() {
                System.out.println("show2...");
            }
        };

        i.show1();
        i.show2();
    }
}

// 接口1
interface Inter{
    void show();
}

// 接口的实现类
class InterImpl implements Inter{

    @Override
    public void show() {
        System.out.println("InterImpl 重写的show方法");
    }
}

// 接口2
interface Inter2{
    void show1();
    void show2();
}