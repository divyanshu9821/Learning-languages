import java.util.Stack;

public class stack_pushAtBottom{
    
    static int data = 0;

    public static void pushAtBottom(Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(5);
        s1.push(3);
        s1.push(10);
        s1.push(56);
        s1.push(2);
        data = 12;
        pushAtBottom(s1);
        System.out.println(s1);
    }
}