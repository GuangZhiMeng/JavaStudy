package LeiBuLei;

public class Test1Inner {
    /*
        ���ýӿ��еķ���
        1. �����ýӿڵ�ʵ���࣬ͨ��implements �ؼ���ȥʵ�ֽӿ�
        2. ��д����
        3. ����ʵ�������
        4. ������д��ķ���

        ʹ�������ڲ��������ýӿ��еķ���
        �����ڲ���
        ǰ�᣺��Ҫ������/�ӿ�
        ��ʽ��
            new ����\�ӿ���(){
                ��д����
            }
     */

    public static void main(String[] args) {
        // �����ӿ�ʵ����Ķ��󣬵��ýӿ��еķ���
        InterImpl li = new InterImpl();
        li.show();

        // ʹ�������ڲ���
        // �����ڲ������⣺���̳�\ʵ�֣�������д���������󣬷�����һ������
        // ���´����ǣ�ʵ����Inter�ӿڵģ�һ��ʵ�������
        // ������Ե������������������һ�� .show()
        new Inter(){
            @Override
            public void show() {
                System.out.println("�����ڲ����е�show����");
            }
        }.show();


        // �������ǰ�ӿ��д��ڶ����������ԭ���ĵ��ò���ͬʱ���ö������
        // ����취���������õ����������
        // �Զ�̬��������ʵ��
        Inter2 i = new Inter2(){
            @Override
            public void show1() {
                System.out.println("show1...");
            }

            @Override
            public void show2() {
                System.out.println("show2...");
            }
        };

        i.show1();
        i.show2();
    }
}

// �ӿ�1
interface Inter{
    void show();
}

// �ӿڵ�ʵ����
class InterImpl implements Inter{

    @Override
    public void show() {
        System.out.println("InterImpl ��д��show����");
    }
}

// �ӿ�2
interface Inter2{
    void show1();
    void show2();
}