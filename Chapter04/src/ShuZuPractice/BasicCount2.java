package ShuZuPractice;
/*
����Ļ����㷨2��
����ֵ�������ֵ����Сֵ
 */
public class BasicCount2 {
    public static void main(String[] args) {
        // Ԫ�ظ�����10����ͨ��Math.random()��������Χ[0,100)
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100);
            System.out.println(arr[i]);
        }

        //˼·��
        //�ҳ�����������ֵ
        int max = arr[0];//�����һ��Ԫ�����
        //arr[0]Ԫ�ز��ú�max���ˣ����� i=1
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){//����Сֵ���ͰѴ��ںű��С�ں�
                max = arr[i];
            }
        }
        System.out.println("���ֵ��" + max);
    }
}
