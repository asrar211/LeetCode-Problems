class DLL {
    private Node head;

    static class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }


    public void deleteAtHead() {
        if (head == null) {
            System.out.println("\nList is already empty.");
            return;
        }

        Node temp = head;
        head = head.next;

        if (head != null) {
            head.prev = null;
        }

        temp.next = null;
    }

    public void deleteAtTail() {
        if (head == null) {
            System.out.println("\nList is already empty.");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.prev.next = null;
        temp.prev = null;
    }

}


