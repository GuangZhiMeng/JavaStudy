package DuoTai.test1;

public class DuoTaiDingYi {
    /*
        ��̬��ǰ�������
            �м̳�/ʵ�ֹ�ϵ
            �з�����д
            �и�������ָ���������
     */
    public static void main(String[] args){
        // 3.�и�������ָ���������
        // ��ǰ�����һֻ����
        // ��̬
        Animal a = new Cat();

        // ֱ�Ӵ����������
        // ��ǰ�����һֻè
        Cat c = new Cat();
    }
}

// 1.�м̳�/ʵ�ֹ�ϵ
class Animal{
    public void eat(){
        System.out.println("����Է�");
    }
}

// 2.�з�����д
class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("è����");
    }
}