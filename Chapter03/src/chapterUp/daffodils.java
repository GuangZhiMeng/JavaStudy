package chapterUp;

public class daffodils {
    public static void main(String[] args) {
        //��νˮ�ɻ�����ָһ��3λ���������λ�����������͵����䱾�����磺
        // 153 = 1\*1\*1 + 5\*5\*5 + 3\*3\*3���ҳ����е�ˮ�ɻ�������ͳ�������м�����

        int count = 0;//ͳ�Ƹ���
        System.out.println("���е�ˮ�ɻ���Ϊ��");
        for(int num = 100;num <= 999;num++){
            int ge = num % 10;
            int shi = (num % 100) / 10;
            int bai= num / 100;
        if(num == (ge*ge*ge)+(shi*shi*shi)+(bai*bai*bai)){
            System.out.println(num);
            count++;
            }
        }
        System.out.println("ˮ�ɻ����ܸ�����" + count);
    }
}
