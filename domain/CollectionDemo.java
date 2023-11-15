package domain;

import java.util.*;


public class CollectionDemo {

    public static void main(String[] args) {
        // ����һ���յ�ArrayList��һ���յ�LinkedList
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        // ���������б������һЩԪ��
        arrayList.add("Alice");
        arrayList.add("Bob");
        linkedList.add("Carol");
        linkedList.add("David");

        // ��֤�������б�Ĵ�С�Ƿ���ȷ
        System.out.println("ArrayList size: " + arrayList.size());
        System.out.println("LinkedList size: " + linkedList.size());

        // ��ArrayList�а���������Ԫ��
        String fromArrayList = arrayList.get(0);
        System.out.println("Element at index 0 in ArrayList: " + fromArrayList);

        // ��LinkedList�а���������Ԫ��
        String fromLinkedList = linkedList.get(1);
        System.out.println("Element at index 1 in LinkedList: " + fromLinkedList);

        // ����һ��HashSet�����������һЩԪ��
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Alice");
        hashSet.add("Bob");
        hashSet.add("Alice"); // ����ظ�Ԫ��

        // ��֤HashSet�е�Ԫ���Ƿ�Ψһ
        System.out.println("HashSet size: " + hashSet.size());

        // ����һ��HashMap����ѧ������ӳ�䵽���ǵķ���
        Map<String, Integer> studentScores = new HashMap<>();
        studentScores.put("Alice", 95);
        studentScores.put("Bob", 88);
        studentScores.put("Carol", 92);

        // ��֤ӳ���Ƿ���ȷ
        System.out.println("Alice's score: " + studentScores.get("Alice"));
        System.out.println("Bob's score: " + studentScores.get("Bob"));
        System.out.println("Carol's score: " + studentScores.get("Carol"));

        // ģ���������豸����
        Map<String, Double> iotData = new HashMap<>();
        iotData.put("Device1", 25.5);
        iotData.put("Device2", 30.2);
        iotData.put("Device3", 22.8);

        // �����������豸���ݲ���ʾ
        System.out.println("IoT Device Data:");
        for (Map.Entry<String, Double> entry : iotData.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + "��C");
        }
    }
}
