package heimaoop;

public class TestStudent {
    public static void main(String[] args) {
        // 使用无参构造方法创建对象，通过set方法赋值
        Student stu1 = new Student();
        stu1.setName("张三");
        stu1.setAge(23);
        stu1.show();

        // 使用带参数构造方法创建对象，直接赋值
        Student stu2 = new Student("李四",24);
        stu2.show();
    }
}
