package heimaoop;

public class TestStudent {
    public static void main(String[] args) {
        // ʹ���޲ι��췽����������ͨ��set������ֵ
        Student stu1 = new Student();
        stu1.setName("����");
        stu1.setAge(23);
        stu1.show();

        // ʹ�ô��������췽����������ֱ�Ӹ�ֵ
        Student stu2 = new Student("����",24);
        stu2.show();
    }
}
