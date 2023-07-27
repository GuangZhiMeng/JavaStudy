package oop;

public class BookTest {
    public static void main(String[] args) {
        //创建对象
        //类名 对象名 = new 类名（）;
        Book book01 = new Book();
        book01.id = "001";
        book01.name = "三国";
        book01.price = 88.88;

        //创建第二个对象
        Book book02 = new Book();
        book02.id = "002";
        book02.name = "水浒";
        book02.price = 88.88;

        //创建第三个对象
        Book book03 = new Book();
        book03.id = "003";
        book03.name = "富婆通讯录";
        book03.price = 10000;

        //调用3个对象，各自的show方法展示属性信息
        book01.show();
        book02.show();
        book03.show();
    }
}
