package string;

public class RunTime {
    public static void main(String[] args) {
        // System.currentTimeMillis(); ��ȡ1970��1��1��0ʱ0��0�� ����ǰʱ���������ĺ���ֵ
        // ��¼�����������ǰ��ʱ��
        long star = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 50000; i++) {
            sb.append(i);
        }

        // ��¼����������֮���ʱ��
        long end = System.currentTimeMillis();
        // �������ǰ����������ʱ��
        // 1�� = 1000����
        System.out.println(end - star);
    }
}
