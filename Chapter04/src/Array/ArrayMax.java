package Array;

public class ArrayMax {
    public static void main(String[] args){
        //�þ�̬��ʼ����������
        int[] q = new int[]{11,77,98,66,83};

        //���������еĵ�һ��Ԫ��Ϊ���ֵ
        int max = q[0];

        //�������飬��ȡÿһ��Ԫ�أ�׼�����бȽ�
        for (int i = 1; i < q.length; i++){
            if (q[i] > max){
                //����ȽϵĹ����У������˱� max ����ģ��� max ��¼�����ֵ
                max = q[i];
            }
        }
        //ѭ�������󣬴�ӡ���ֵ
        System.out.println("Max = " + max);
    }
}
