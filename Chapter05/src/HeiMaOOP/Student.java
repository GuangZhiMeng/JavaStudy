package HeiMaOOP;

// JavaBean�ࣺ��װ����
public class Student {
    // ��Ա����
    private String name;
    private int age;

    // ���췽��
    public Student(){//�޲ι��췽��

    }

    //���ι��췽��
    public Student(String name, int age){
        this.name = name;//��this�ؼ��ְ��βδ�����Ա����
        this.age = age;
    }

    // ��ÿһ����Ա�����ṩset��get����
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    // ��Ա����
    public void show(){
        System.out.println(name + "..." + age);
    }

}
