package Array;

import java.util.ArrayList;

public class DemoArrayListRemove {
    public static void main(String[] args) {
        // �������϶���
        ArrayList<String> list = new ArrayList<>();

        // ����add����������ַ���
        list.add("test");
        list.add("����");
        list.add("����");
        list.add("test");
        list.add("test");

        // ��������
        for (int i = 0; i < list.size(); i++) {
           String stu =  list.get(i);
           // ע���ڼ����У����ɾ����һ��Ԫ�أ������Ԫ�ػ�������ǰ�ƶ������Ϊnull
           if(("test").equals(stu)){
               list.remove(i);
               i--;// ���Ҫɾ��һ�������е�����Ԫ�أ�һ��Ҫ�ڱ��������м��� i -- ����Ȼ���ܾͻ���ĳЩԪ��
           }
        }

        // �������Ԫ��
        System.out.println(list);
    }
}
