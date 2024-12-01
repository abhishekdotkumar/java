package LinkedList;

import LinkedList.LL.ListNode;;

public class Demo {

    public static void main(String[] args) {
        LL list1 = new LL();
        list1.insertHead(8);
        list1.insertHead(6);
        list1.insertHead(3);
        list1.insertHead(1);

        ListNode list2 = reverse(list1.head);

        list1.print();

    }

    public static ListNode reverse(ListNode head) {

        ListNode prev = null;
        ListNode current = head;
        ListNode nextnode = current.next;

        while (current != null) {
            current.next = prev;
            current.next = nextnode;
            if (nextnode.next != null) {
                nextnode = nextnode.next;
            }
        }

        return prev;
    }
}
