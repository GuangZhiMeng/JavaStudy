package homework01;
//����һ��ѧ���࣬�����������ԣ��������ԣ��Ա�����
public class Student {
    private int age;
    private String name;
    private String gender;

    //�����������������ԣ��������ԣ��Ա�����
    public Student(int age, String name, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    // ��eat���������xxx���ڳԷ�
    public void eat() {
        System.out.println(name + "���ڳԷ�");
    }

    // ��sleep�������:xxx����˯��
    public void sleep() {
        System.out.println(name + "����˯��");
    }

    // ��study�������:xxx����ѧϰ
    public void study() {
        System.out.println(name + "����ѧϰ");
    }
}
