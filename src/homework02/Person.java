package homework02;

//����һ��Person��
public class Person {
    //����name��age����
    String name;
    int age;

    //����һ��Ĭ�ϵĲ��������Ĺ��췽��Person()
    public Person() {
        //��name��age��Ĭ��ֵ
        name = "��֮��";
        age = 9;
        //��ӡ��Ϣ
        System.out.println("Person() is children");
    }

    //���幹�췽������Person(String n)
    public Person(String n) {
        //��name��ֵ��age����Ĭ��ֵ
        name = "��֮��";
        age = 19;
        //��ӡ��Ϣ
        System.out.println("Person(String ��֮��) is adult");
    }

    //���幹�췽������Person(String �Ż�, int 18)
    public Person(String n, int a) {
        //��name��age��ֵ
        name = "�Ż�";
        age = 17;
        //��ӡ��Ϣ
        System.out.println("Person(String �Ż�, int 17) is called");
    }

    //����һ��������ӡname��age
    public void printInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}