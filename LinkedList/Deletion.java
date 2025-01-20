class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SLL {
    private Node head;

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void display() {

        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void deleteAtHead() {
        if (head == null) {
            System.out.println("The list is already empty.");
            return;
        }
        head = head.next;
    }

    public void deleteAtTail() {
        if (head == null || head.next == null) {
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void deleteKth(int k) {
        if (head == null)
            return;

        if (k == 1) {
            head = head.next;
            return;
        }

        Node temp = head;
        Node prev = null;
        int count = 0;

        while (temp != null) {
            count++;
            if (count == k) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
    }

    public void deleteByVal(int value) {
        if (head == null)
            return;

        if (head.data == value) {
            head = head.next;
            return;
        }

        Node temp = head;
        Node prev = null;

        while (temp != null && temp.data != value) {
            prev = temp;
            temp = temp.next;

            if (temp == null) {
                System.out.println("Value not found in the list.");
                return;
            }
        }
        prev.next = temp.next;
    }
}

public class Deletion {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // list.deleteAtHead();
        // list.deleteAtTail();
        // list.deleteKth(5);
        list.deleteByVal(3);

        System.out.println("Original List:");
        list.display();
    }
}
