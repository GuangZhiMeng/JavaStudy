package homework01;

//����һ��Dog��
public class Dog {
    /*
    1.����һ��Dog�࣬��Dog���������String���͵����ԣ��ֱ���name��color��variety ��
    ���������������ֱ��ǣ�eat��run��
2.��main�����д���һ����Ϊwuhuarou��Dog���󣬲�����nameΪ�廨�⣬colorΪ��ɫ��varietyΪ����˹�ӡ�
3.ʹ�õ���wuhuarou�����eat����������й�ͷ������run������������Ź�ͷ�ܡ�
     */

    //��Dog���������String���͵�����
    String name;
    String color;
    String variety;

    //���������������ֱ��ǣ�eat��run
    //eat��������й�ͷ
    void eat(){
        System.out.println("�й�ͷ");
    }

    //run����������Ź�ͷ��
    void run(){
        System.out.println("���Ź�ͷ��");
    }
}

    //��main�����д���һ����Ϊwuhuarou��Dog���󣬲�����nameΪ�廨�⣬colorΪ��ɫ��varietyΪ����˹��
class Main {
    public static void main(String[] args) {
        Dog wuhuarou = new Dog();
        wuhuarou.name = "�廨��";
        wuhuarou.color = "��ɫ";
        wuhuarou.variety = "����˹��";

        //ʹ�õ���wuhuarou�����eat����������й�ͷ������run������������Ź�ͷ��
        wuhuarou.eat();
        wuhuarou.run();
    }
}