package domain;

import java.util.*;


public class CollectionDemo {

    public static void main(String[] args) {
        // 创建一个空的ArrayList和一个空的LinkedList
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        // 向这两个列表中添加一些元素
        arrayList.add("Alice");
        arrayList.add("Bob");
        linkedList.add("Carol");
        linkedList.add("David");

        // 验证这两个列表的大小是否正确
        System.out.println("ArrayList size: " + arrayList.size());
        System.out.println("LinkedList size: " + linkedList.size());

        // 从ArrayList中按索引查找元素
        String fromArrayList = arrayList.get(0);
        System.out.println("Element at index 0 in ArrayList: " + fromArrayList);

        // 从LinkedList中按索引查找元素
        String fromLinkedList = linkedList.get(1);
        System.out.println("Element at index 1 in LinkedList: " + fromLinkedList);

        // 创建一个HashSet并向其中添加一些元素
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Alice");
        hashSet.add("Bob");
        hashSet.add("Alice"); // 添加重复元素

        // 验证HashSet中的元素是否唯一
        System.out.println("HashSet size: " + hashSet.size());

        // 创建一个HashMap，将学生姓名映射到他们的分数
        Map<String, Integer> studentScores = new HashMap<>();
        studentScores.put("Alice", 95);
        studentScores.put("Bob", 88);
        studentScores.put("Carol", 92);

        // 验证映射是否正确
        System.out.println("Alice's score: " + studentScores.get("Alice"));
        System.out.println("Bob's score: " + studentScores.get("Bob"));
        System.out.println("Carol's score: " + studentScores.get("Carol"));

        // 模拟物联网设备数据
        Map<String, Double> iotData = new HashMap<>();
        iotData.put("Device1", 25.5);
        iotData.put("Device2", 30.2);
        iotData.put("Device3", 22.8);

        // 遍历物联网设备数据并显示
        System.out.println("IoT Device Data:");
        for (Map.Entry<String, Double> entry : iotData.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + "°C");
        }
    }
}
