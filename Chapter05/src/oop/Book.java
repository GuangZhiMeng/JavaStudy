package oop;

public class Book {
    //属性
    String id;
    String name;
    double price;

    //行为
    public void show(){
        System.out.println(id + "\t" + name + "\t" + price);
    }
}
