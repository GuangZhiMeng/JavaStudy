package ShuZu;
/*
   �������10��[0,100)֮�������ŵ�һά�����У�Ȼ������������������ͳ�������������3�ı����м�����
*/
public class ArrayMultiple {
    public static void main(String[] args) {
        // 1������һ�����飬���ҳ�ʼ������Ϊ 10
        //������ʽ��Ԫ�ص�����[] ������ = new Ԫ�ص�����[����];
        int[] arr = new int[10];
        //2����Ԫ�ظ�ֵ
        //ͨ��Math.random()��������Χ[0,100)
        //Math.random()����ϵͳ���ѡȡ���ڵ��� 0.0 ��С�� 1.0 ��α��� double ֵ
        //3��˳��ͳ�Ƹ���
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
           arr[i] = (int)(Math.random()*100);
            System.out.println(arr[i]);
            if(arr[i] % 3 == 0){
                count++;
            }
        }        System.out.println("�����������������3�ı������У�" + count + "��");
    }
}
