package chapterUp;

public class foobizbaz {
    public static void main(String[] args) {
        /*
        ��1ѭ����150����ÿ�д�ӡһ��ֵ��
        ������ÿ��3�ı������ϴ�ӡ����foo��,��ÿ��5�ı������ϴ�ӡ��biz��,��ÿ��7�ı������ϴ�ӡ�����baz��
         */

        for (int i = 1; i <= 150; i++) {
            System.out.print(i);
            //if ���еĻ��Ͷ�������ж�
            // �Ʊ����ֱ��д��""˫��������
            if(i % 3 == 0) {
                System.out.print("\t\tfoo");
            }
            if(i % 5 == 0) {
                    System.out.print("\t\tbiz");
            }
            if(i % 7 == 0){
                System.out.print("\t\tbaz");
            }
            System.out.println();//����ո�
        }
    }
}
