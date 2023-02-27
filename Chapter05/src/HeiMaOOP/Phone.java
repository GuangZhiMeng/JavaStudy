package HeiMaOOP;

public class Phone {
    // 成员变量
    // 品牌 价格
    String brand;
    int price;

    // 成员方法
    // 打电话 发短信
    public void call(String name){
        System.out.println("给" + name + "打电话");
    }

    public void message(){
        System.out.println("群发短信");
    }

}
