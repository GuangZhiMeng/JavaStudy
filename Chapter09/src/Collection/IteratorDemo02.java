package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("d");

        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            if("b".equals(s)){
                // ָ��˭ ��ô��ʱ��ɾ��˭
                it.remove();
            }
        }
        System.out.println(list);
    }
}
