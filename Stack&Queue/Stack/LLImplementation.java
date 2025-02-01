
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Stack{
    Node top;
    int size;

    public void push(int x){
        Node temp = new Node(x);
        temp.next = top;
        top = temp;
        size++;
    }

    public void pop(){
        if(top == null){
            System.out.println("Stack is empty");
            return;
        }
        top = top.next;
        size--;
    }

    public int top(){
        return top.data;
    }

    public int size(){
        return size;
    }
}

class Queue{
    Node start, end;
    int size;

    public void push(int x){
        Node temp = new Node(x);
       if(start == null){
           start = end = temp;
       }else{
           end.next = temp;
           size++;
       }
}
    public void pop(){
        if(start == null){
            System.out.println("Queue is empty");
            return;
        }
        start = start.next;
        size--;
    }

    public int top(){
        return start.data;
    }

    public int size(){
        return size;
    }

}
public class LLImplementation {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
        System.out.println(s.size());

        Queue q = new Queue();
        q.push(10);
        q.push(20);
        q.push(30);
        System.out.println(q.top());
        q.pop();
        System.out.println(q.top());
        System.out.println(q.size());
    }
}
