package ShuZu;

public class Debug {
    public static void main(String[] args) {
        /*
        Debug�Ĳ���
        1����ϵ㣬�ڴ�������(�к�)��λ�õ�������С��Ȧ�����Ƕϵ㡣
        �ϵ㣺�������е����λ�û�ͣ���������Բ鿴��ǰ������ֵ

        2����Debugģʽ����

        3����������
        Step Over(F8):ִ��һ�����
        Step Into(F7):������õķ���Դ��
        Force Step Into(Alt + shift + F7):������õ�ϵͳ������Դ��
        Step Out(Shift + F8):�˳���ǰ��������
         */

        String[] names = {"����","����","����"};
        int[] scores = {89,56,100};

        int[] arr = new int[5];// arr{0,0,0,0,0}
        for(int i = 0; i < arr.length; i++){
            arr[i] = 2 * i + 1;
        }
    }
}
