package DuoTai.test2;

public class DuoTaiGuanXi {
    /*
        ��̬��ǰ�������
            �м̳�/ʵ�ֹ�ϵ
            �з�����д
            �и�������ָ���������
     */
    public static void main(String[] args) {
        // �и�������ָ���������
        Fu f = new Zi();
    }
}

class Fu{
    int num = 10;

    public void method(){
        System.out.println("Fu����method");
    }
}

class Zi extends Fu{
    int num = 20;
    @Override
    public void method(){
        System.out.println("Zi����method");
    }
}