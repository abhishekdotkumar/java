package LinkedList;

public class LL {
    ListNode head;
    ListNode tail;
    int size = 0;

    LL() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    public class ListNode {
        int val;
        ListNode next;

        public ListNode(int val, ListNode node) {
            this.val = val;
            this.next = node;
        }

        public ListNode() {
            this.val = 0;
            this.next = null;
        }

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }

    }

    void insertHead(int val) {
        ListNode temp = new ListNode(val);
        if (head != null) {
            temp.next = head;
            head = temp;
        } else {
            head = temp;
        }
        if (this.size == 0) {
            tail = temp;
            tail.next = null;
        }
        size++;
    }

    void print() {
        ListNode temp = head;
        while (temp.next != null) {

            System.out.print(temp.val + " -> ");

            temp = temp.next;
        }
        System.out.println(temp.val);
    }
}