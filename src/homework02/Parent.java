package homework02;

class Parent {
    // 定义一个属性name
    String name;

    public Parent(String name) {
        name = "光之梦";
    }

    // 定义一个输出属性方法showInfo
    public void showInfo() {
        System.out.println("name: " + name);
    }
}