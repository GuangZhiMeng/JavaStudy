package Integer;

public class MyIntegerDemo4 {
    //������һ���ַ�������91 27 46 38 50���������е�ÿһ�����浽int���͵�������
    //˼·��
    //�� ����һ���ַ���
    //�� ���ַ����е��������ݴ洢��һ��int���͵�������
    //�� ��������������
    public static void main(String[] args) {
        String s = "91 27 46 38 50";
        // ��ȡ�ַ����е�ÿһ������,���տո���зָ�
        String[] strArr = s.split(" ");

        // ����һ��int���͵�����
        int [] numberArr = new int[strArr.length];

        // ��strArr�е����ݽ�������ת�������뵽int������
        for (int i = 0; i < numberArr.length; i++) {
            int number = Integer.parseInt(strArr[i]);
            numberArr[i] = number;
        }

        // ����int���͵�����
        for (int i = 0; i < numberArr.length; i++) {
            System.out.println(numberArr[i]);
        }
    }
}
