package Array;

import java.util.ArrayList;

public class DemoArrayList01 {
    public static void main(String[] args) {
        // ����������������
        ArrayList<String> list = new ArrayList<>();
        // ���ö����add���������������������
        // ������� public boolean add(E e)
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        //System.out.println(list); // [111, 222, 333, 444]

        // �Զ���λ����� public void add(int index,E element)
        list.add(1,"666");
        System.out.println(list);// [111, 666, 222, 333, 444]
    }
}
