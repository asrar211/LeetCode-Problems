class Node{
    int data;
    Node next;
    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}
public class Traversal {
    public static Node convert(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;

        for(int i=0; i< arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static void main(String[] args){
        int[] arr= {2, 3, 4, 5};
        Node head = convert(arr);

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }
}

