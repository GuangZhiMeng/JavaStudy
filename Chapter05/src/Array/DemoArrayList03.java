package Array;

import java.util.ArrayList;

public class DemoArrayList03 {
    public static void main(String[] args) {
        // �������϶���
        ArrayList<String> list = new ArrayList<>();

        // �����϶���������ַ�������
        list.add("����");
        list.add("����");
        list.add("����");

        // �������� list.fori
        for (int i = 0; i < list.size(); i++) {
            // i:ÿһ������ֵ
            String s = list.get(i);
            System.out.println(s);
        }
    }
}
