package tiaojianYSF;

public class Binary {
    public static void main(String[] args) {
        int num = -1; //����һ��������
        int i = 31;
        while(i >= 0){
            //��ѭ���У�ʹ��λ�����>>��num����iλ��Ȼ��ʹ��&�����ȡ�����һλ������������1��0��
            //&: ������Ӧλ����1������Ϊ1������Ϊ0
            //& ��λ����� AND����ʾ������������������ AND ����
            //1 ��һ��������������ʾֻ�����һλ��1������λ����0��
            int bit = (num >> i) & 1;

            System.out.print(bit);
            //i��31�ݼ���0����ʾ32λ���������е�ÿһλ
            i--;
        }
    }
}
