package Array;

public class ArrayDemo1{
    public static void main(String[] args){
        //�þ�̬��ʼ������һ������
        int[] q = new int[] {11,22,33,44,55};
        //���ñ�������
        printArray(q);
    }

    //����һ����������������б���
    public static void printArray(int[] q){
        // q.fori
        System.out.print("[");
        for (int i = 0; i < q.length; i++) {
            if (i == q.length - 1){
                //�������������˵���������һ��Ԫ�أ��ǾͰ����һ�����Ż��� ]
                //Ϊ�˲�Ӱ�췽������Ĵ��룬�����һ�δ�ӡʱҪ���д���
                System.out.println(q[i] + "]");
            }else {
                //������ӡ�����ݲ�����
                System.out.print(q[i] + ",");
            }
        }

    }
}