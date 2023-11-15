package ShuJu1;
    public class LinkedList {
        private ListNode head;

        public LinkedList() {
            head = null;
        }

        // ͷ�巨����Ԫ��
        public void insertAtHead(int val) {
            ListNode newNode = new ListNode(val);
            if (head == null) {
                head = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
        }

        // β�巨����Ԫ��
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
