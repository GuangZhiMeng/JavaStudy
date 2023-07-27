package StudentManage;

public class Student {
    private int num;//学号
    private String name;//姓名
    private int Age;//年龄

    //右击——生成——get,set

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public boolean equals(Object obj){
        Student student = (Student) obj;
        return student.num == this.num;
    }
}
