class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLL {
    private Node head;

    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void insertAtTail(int data) {
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
        newNode.prev = temp;
    }

    public void insertAtK(int data, int k) {
        Node newNode = new Node(data);

        if (k == 1) {
            insertAtHead(data);
            return;
        }
        Node temp = head;
        int count = 1;
        while (temp != null && count < k - 1) {
            temp = temp.next;
            count++;
        }
        if (temp == null || temp.next == null) {
            insertAtTail(data);
            return;
        }
        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null) {
            temp.next.prev = newNode;
        }
        temp.next = newNode;
    }
}

