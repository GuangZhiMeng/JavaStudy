package heimaoop;

public class TestPhone {
    public static void main(String[] args) {
        // 创建对象
        Phone p = new Phone();

        // 给成员变量进行赋值
        p.brand = "华为";
        p.price = 3999;

        // 打印赋值后的成员变量
        System.out.println(p.brand + "..." + p.price);

        // 调用成员方法
        p.call("光偷强");
        p.message();
    }
}
