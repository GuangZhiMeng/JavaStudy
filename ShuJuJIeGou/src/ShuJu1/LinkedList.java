package ShuJu1;
    public class LinkedList {
        private ListNode head;

        public LinkedList() {
            head = null;
        }

        // 头插法插入元素
        public void insertAtHead(int val) {
            ListNode newNode = new ListNode(val);
            if (head == null) {
                head = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
        }

        // 尾插法插入元素
        public void insertAtTail(int val) {
            ListNode newNode = new ListNode(val);
            if (head == null) {
                head = newNode;
            } else {
                ListNode curr = head;
                while (curr.next != null) {
                    curr = curr.next;
                }
                curr.next = newNode;
            }
        }
    }
