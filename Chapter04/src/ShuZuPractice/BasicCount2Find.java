package ShuZuPractice;
/*
3������Ԫ�صĲ���
(1)˳����ң������Ԫ�ذ�����Ŀ�����ȶԣ������ȣ��ͱ�ʾ�ҵ��ˣ�����Ԫ�ض����ȣ�����û�ҵ�
(2)���ֲ��ң�
�����Ԫ�ر���������ģ�һ���Ǵ�С����

�Բ���Ϊ����[1,100]
��50����ʾ���ˣ��ų���[50,100]
��25����ʾС�ˣ��ų���[1,25]
����
 */
public class BasicCount2Find {
    public static void main(String[] args) {
        //ǰ�᣺�����������
        int[] arr = {3,6,8,12,35,78,89};
        int target = 6;

        int index = -1;//�������±겻������-1
        for(int left = 0,right = arr.length - 1; left <= right; ){
            //int mid = (left + right) / 2;
            int mid = left + (right - left) / 2;
            if(target == arr[mid]){
                index = mid;
                break;
            }else if(target > arr[mid]){
                //Ŀ�꿿�ұߣ��޸���߽�
                left = mid + 1;//�ų���[֮ǰleft,mid]
            }else{
                //Ŀ�꿿��ߣ��޸��ұ߽�
                right = mid - 1;//�ų���[mid,֮ǰ��right]
            }
        }

        if(index == -1){
            System.out.println("������");
        }else{
            System.out.println("����");
            System.out.println("�±��ǣ�" + index);
        }
    }
}
