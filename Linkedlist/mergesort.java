import java.util.*;

public class mergesort {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // add first
    public void addfirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // print linked list
    public void printll() {
        if (head == null) {
            System.out.println("ll is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // get middle
    private Node getmid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // merge two sorted lists
    private Node merge(Node head1, Node head2) {
        Node dummy = new Node(-1);
        Node temp = dummy;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return dummy.next;
    }

    // merge sort
    public Node mergesortt(Node head) {
        // base condition
        if (head == null || head.next == null) {
            return head;
        }

        Node mid = getmid(head);
        Node rightHead = mid.next;
        mid.next = null;

        Node left = mergesortt(head);
        Node right = mergesortt(rightHead);

        return merge(left, right);
    }

    public static void main(String args[]) {
        mergesort ll = new mergesort();

        ll.addfirst(1);
        ll.addfirst(2);
        ll.addfirst(3);
        ll.addfirst(4);
        ll.addfirst(5);

        ll.printll();              // before sort
        ll.head = ll.mergesortt(ll.head);
        ll.printll();              // after sort
    }
}
