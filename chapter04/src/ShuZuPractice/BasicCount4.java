package ShuZuPractice;
/*
�ҳ����ֵ���������ֵ���±꣨����һ���ģ�
 */
public class BasicCount4 {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,2,7,1};
        /*
        ˼·:
        1�����ҵ����ֵ
        2��ѭ����������ЩԪ�غ����ֵһ��
         */
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("���ֵ��:" + max);
        System.out.println("���ֵ���±��У�");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == max){
                System.out.println("[" + i + "]");
            }
        }
    }
}
