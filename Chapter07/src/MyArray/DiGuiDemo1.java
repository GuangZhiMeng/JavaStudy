package MyArray;

public class DiGuiDemo1 {
    public static void main(String[] args) {
        int result = getJc(5);
        System.out.println(result);
    }

    // �ݹ鷽����׳�
    private static int getJc(int i){
        // 1.һ��Ҫ�ҵ�����
        if (i == 1){
            return 1;
        }else {
            // 2.�ݹ�Ĺ���
            return i * getJc(i - 1);
        }
    }
}
