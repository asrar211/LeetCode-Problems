
class DLL {
    private Node head;

    class Node{
        int data;
        Node prev;
        Node next;
    
        public Node(int data){
            this.data= data;
            this.prev = null;
            this.next = null;
        }
    }

    public void convert(int[] arr){
        head = new Node(arr[0]);
        Node temp = head;

        for(int i=1;i< arr.length;i++){
            Node newNode = new Node(arr[i]);
            temp.next = newNode;
            newNode.prev = temp;
            temp = newNode;
        }

    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void displayBackwards(){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
    }
}
public class ConvertArrayToDLL {
    public static void main(String[] args) {
        DLL list = new DLL();
        int[] arr = {10,20,30,40,50};

        list.convert(arr);
        list.display();
        System.out.println();
        list.displayBackwards();
    }
    
}
