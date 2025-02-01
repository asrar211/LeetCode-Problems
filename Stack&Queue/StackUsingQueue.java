import java.util.LinkedList;
import java.util.Queue;

class St{
    Queue<Integer> q = new LinkedList<>();


    void push1(int x){
        int size = q.size();
        q.add(x);
        
        for( int i=1; i<=size; i++){
            q.add(q.poll());
        }
    }

    void pop1(){
        if(q.isEmpty()){
            System.out.println("No elements");
        }
        else{
            q.poll();
        }
    }

    int top(){
        if(q.isEmpty()){
            return -1;
        }
        else{
            return q.peek();
        }
    }

    int size(){
        return q.size();
    }

}
public class StackUsingQueue {
    public static void main(String[] args) {
        St stack = new St();
        stack.push1(1);
        stack.push1(2);
        stack.push1(3);

        System.out.println(stack.top());
        stack.pop1();
        System.out.println(stack.top());
        stack.pop1();
        System.out.println(stack.top());
        
    }
}
