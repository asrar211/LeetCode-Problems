
class Stack{
        private int top=-1;
        int st[] = new int[10];
    
        public void push(int x){
            if( top >= 9){
                System.out.println("Stack Overflow");
            }
            
            top++;
            st[top] = x;
    }

    public int top(){
        if( top== -1){
            System.out.println("Stack Underflow");
            return -1;
        }
        return st[top];
    }

    public void pop(){
        if( top == -1){
            System.out.println("Stack Underflow");
            return;
        }
        top--;
    }

    public int size(){
        return top+1;
    }

}

class Queue{
    int size  = 10;
    int currrent = 0;
    int start = -1;
    int end = -1;
    int q[] = new int[size];

    public void push(int x){
        if( currrent == size){
            System.out.println("Queue Overflow");
            return;
        }
        if( currrent == 0){
            start = 0;
            end = 0;
        }else{
            end = (end+1) % size;
        }
        q[end] = x;
        currrent++;
    }

    public int pop(){
        if( currrent == 0){
            System.out.println("Queue Underflow");
            return -1;
        }
        int el = q[start];
        if(currrent == 1){
            start = -1;
            end = -1;
    }else{
        start = (start+1) % size;
    }
    currrent--;
    return el;
}

public int top(){
    if(currrent == 0){
        System.out.println("Queue Underflow");
        return -1;
    }
    return q[start];
}

public int size(){
    return currrent;
}

}

public class ArrayImplementation {
    public static void main(String[] args) {

        //Stack
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
        System.out.println(s.size());

        //Queue
        Queue q = new Queue();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        System.out.println(q.top());
        q.pop();
        System.out.println(q.top());
        System.out.println(q.size());
    }
}
