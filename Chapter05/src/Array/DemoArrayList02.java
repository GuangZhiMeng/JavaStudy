package Array;

import java.util.ArrayList;

public class DemoArrayList02 {
    public static void main(String[] args) {
        // ����������������
        ArrayList<String> list = new ArrayList<>();

        // ���ö����add���������������������
        list.add("abc");
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        list.add("555");

        // public int size()���ؼ����е�Ԫ�صĸ���
        int size = list.size();
        System.out.println(size);// 6
    }
}
