public class SystemDemo {
    public static void main(String[] args) {
//    public static void exit(int status) ��ֹ��ǰ���е� Java ������������ʾ�쳣��ֹ
//        System.out.println(111);
//        System.exit(0);// ������ִ�е����������ʱ�򣬾ͱ�ʾ������Ѿ�ֹͣ�ˣ�����Ĵ��벻�����ִ��
//        System.out.println(2222);

//    public static long currentTimeMillis() ���ص�ǰʱ��(�Ժ���Ϊ��λ)
//        long start = System.currentTimeMillis(); // ��ȡ��ǰʱ��
//        for (int i = 0; i < 10000; i++){
//            System.out.println(i);
//        }
//        long end = System.currentTimeMillis();// ��ȡ��ǰʱ��
//        System.out.println(end - start);// 52 �õ��ľ������forѭ�����е�ʱ��

//    arraycopy(����Դ����, ��ʼ����, Ŀ�ĵ�����, ��ʼ����, ��������) ����copy
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = new int[10];
        // ������Ҫ��arr1�е����ݿ�����arr2��
//        System.arraycopy(arr1,0,arr2,0,arr1.length);
//
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.println(arr2[i]);
//        }

        // ��Ҫ��arr1�������Ԫ�أ�������arr2���������������
        System.arraycopy(arr1,3,arr2,8,2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }

}
