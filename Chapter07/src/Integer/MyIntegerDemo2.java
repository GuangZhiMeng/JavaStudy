package Integer;

public class MyIntegerDemo2 {
    // main ���� psvm���� �����Կ�������������
    public static void main(String[] args) {
        Integer i1 = 100;
    //      ����    = Ĭ����һ��������������

    // jdk1.5 ���� ���� �Զ�װ��

    // װ�䣺��һ�������������� ��ɶ�Ӧ�İ�װ��
    // �Զ���java�ײ��������Զ�����valueof����
        System.out.println(i1);

    // jdk1.5������ ���� �Զ�����
    // ���䣺��һ����װ���� ��ɶ�Ӧ�Ļ�����������
        int i2 = i1;
        System.out.println(i2);

        Integer i3 = 100; // ��һ�������������͸�ֵ����װ�� ������ Java���Զ�װ����ơ�
        i3 += 200;
        // ���Ȱ�i3��������ɻ�����������100
        // 100 + 200 = 300
        // �ѻ�����������300�ٴ��Զ�װ����Integer����ֵ��i3
        System.out.println(i3);
    }
}
