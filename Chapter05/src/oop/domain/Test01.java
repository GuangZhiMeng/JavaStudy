package oop.domain;

public class Test01 {
    public static void main(String[] args) {
        OuerClass01 ouerClass01 = new OuerClass01();
        OuerClass01.InerClass01 inerClass01 = ouerClass01.new InerClass01();
        inerClass01.print();
    }
}
