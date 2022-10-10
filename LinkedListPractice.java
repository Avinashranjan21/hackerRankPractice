class SinglyLinkedListNode {
    public int data;
    public SinglyLinkedListNode next;

    SinglyLinkedListNode(int data) {
        this.data = data;
    }
}

public class LinkedListPractice {
    public static void main(String[] args) {
        SinglyLinkedListNode singlyLinkedListNode0 = new SinglyLinkedListNode(5);
        SinglyLinkedListNode singlyLinkedListNode1 = new SinglyLinkedListNode(6);
        SinglyLinkedListNode singlyLinkedListNode2 = new SinglyLinkedListNode(7);
        SinglyLinkedListNode singlyLinkedListNode3 = new SinglyLinkedListNode(8);
        singlyLinkedListNode0.next = singlyLinkedListNode1;
        singlyLinkedListNode1.next = singlyLinkedListNode2;
        singlyLinkedListNode2.next = singlyLinkedListNode3;
        //deleteNode(singlyLinkedListNode0, 2);
        printLinkedList(reverse(singlyLinkedListNode0));
    }

    private static void printLinkedList(SinglyLinkedListNode head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
        SinglyLinkedListNode previous = null;
        SinglyLinkedListNode current = llist;
        if (position == 0) {
            return llist.next;
        }
        for (int i = 0; i < position; i++) {
            previous = current;
            current = current.next;
        }
        previous.next = current.next;
        return llist;
    }

    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        SinglyLinkedListNode previous = null;
        SinglyLinkedListNode current = llist;
        for (int i = 0; i < position; i++) {
            previous = current;
            current = current.next;
        }
        previous.next = newNode;
        newNode.next = current;
        return llist;
    }

    public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
        SinglyLinkedListNode previous = null;
        SinglyLinkedListNode current = llist;
        while (current != null) {
            SinglyLinkedListNode next = current.next; // B
            current.next = previous; // A.next = null
            previous = current; // previous = A
            current = next;
        }
        return previous;
    }

    public static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        while (head1 != null && head2 != null) {
            if (head1.data != head2.data) {
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }

        return head1 == null && head2 == null;
    }
}

