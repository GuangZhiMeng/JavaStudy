package oop.domain;

public class HelloAnonymousClass {
    interface IHello{
        void print();
    }
    public void sayHello() {
        IHello hello1 = new IHello() {
            String name = "AAAAA";
            @Override
            public void print() {
                System.out.println(name);
            }
        };
        hello1.print();

    }
    public static void main(String[] args) {
        HelloAnonymousClass helloAnonymousClass = new HelloAnonymousClass();
        helloAnonymousClass.sayHello();
    }
}
