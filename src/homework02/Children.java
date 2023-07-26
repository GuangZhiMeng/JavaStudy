package homework02;

// 定义一个Children类继承于Parent类
class Children extends Parent {
    // 定义一个属性age
    int age;
    // 定义一个有参的构造方法
    public Children(String name, int age) {
        // 调用父类的构造方法
        super(name);
        // 给当前对象的age属性赋值
        this.age = age;
    }
    // 重写showInfo方法
    public void showInfo() {
        // 调用父类的showInfo方法
        super.showInfo();
        // 输出当前对象的age属性
        System.out.println("age: " + age);
    }
}