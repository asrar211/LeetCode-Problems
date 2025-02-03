import java.util.Stack;

class Q{
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    void push1(int x){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(x);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    void pop1(){
        if(s1.isEmpty()){
            return;
        }
        s1.pop();
    }

    int peek1(){
        if(s1.isEmpty()){
            return -1;
        }
        return s1.peek();
    }
    int size1(){
        return s1.size();
    }
}
public class QueueUsingStack {
    public static void main(String[] args) {
        Q q = new Q();
        q.push1(1);
        q.push1(2);
        q.push1(3);

        System.out.println(q.peek1());
        q.pop1();
        System.out.println(q.peek1());

        System.out.println(q.size1());
    }
}
