package heimaoop;

public class TestPhone {
    public static void main(String[] args) {
        // ��������
        Phone p = new Phone();

        // ����Ա�������и�ֵ
        p.brand = "��Ϊ";
        p.price = 3999;

        // ��ӡ��ֵ��ĳ�Ա����
        System.out.println(p.brand + "..." + p.price);

        // ���ó�Ա����
        p.call("��͵ǿ");
        p.message();
    }
}
