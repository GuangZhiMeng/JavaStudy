package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo01 {
    public static void main(String[] args) {
        // �������϶���
        Collection<String> c = new ArrayList<>();

        // ���Ԫ��
        c.add("hello");
        c.add("world");
        c.add("java");
        c.add("javaEE");

        // Iterator<E> iterator()�����ش˼�����Ԫ�صĵ�������ͨ�����ϵ�iterator���������õ�
        Iterator<String> it = c.iterator();

        // ��whileѭ���Ľ�Ԫ�ص��жϺͻ�ȡ
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
    }
}
