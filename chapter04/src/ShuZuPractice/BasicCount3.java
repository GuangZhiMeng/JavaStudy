package ShuZuPractice;
/*
�����ֵ/��Сֵ�������±�
 */
public class BasicCount3 {
    public static void main(String[] args) {
        int[] arr = {3,5,6,1,2};

        int max = arr[0];//�洢��ǰ���ֵ
        int index = 0;//�洢��ǰ���ֵ���±�
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
                index = i;
            }
        }
        System.out.println("���ֵ��" + max);
        System.out.println("�±꣺[" + index + "]");

        // ����2
        int maxIndex = 0;//�洢��ǰ���ֵ���±�
        for(int i = 1; i < arr.length ; i++){
            if(arr[i] > arr[maxIndex]){
                arr[maxIndex] = arr[i];
                maxIndex = i;
            }
        }
        System.out.println("���ֵ��" + arr[maxIndex]);
        System.out.println("�±꣺[" + maxIndex + "]");
    }
}
