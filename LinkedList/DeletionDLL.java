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

    public void deleteAtK(int k){
        if(head == null){
            return;
        }
        int count =1;
        Node temp = head;

        while (temp != null && count < k) {
            temp = temp.next;
            count++;
        }

        if (temp == null) {
            return;
        }

        Node back = temp.prev;
        Node front = temp.next;

        if(back == null && front == null){
            head = null;
        }
        else if(back == null){
            deleteAtHead();
        } else if( front == null){
            deleteAtTail();
        } 
        back.next = front;
        front.prev = back;
    }

    public void deleteByVal(int val){
        Node temp = head;

        while(temp != null && temp.data != val){
            temp = temp.next;
        }
        if(temp == null){
            return;
        }

        Node back = temp.prev;
        Node front = temp.next;
        if(back == null && front == null){
            head = null;
        }
        else if(back == null){
            deleteAtHead();
        } else if( front == null){
            deleteAtTail();
        }
        back.next = front;
        front.prev = back;
    }

}


