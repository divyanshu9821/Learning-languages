import java.util.Stack;
public class stack_reverse {

    public static void reverse(Stack<Integer> s){
        if(s.isEmpty())
            return;
        int top = s.pop();
        reverse(s);
        pushAtBottom(s,top);
    }

    public static void pushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(5);
        s1.push(3);
        s1.push(10);
        s1.push(56);
        s1.push(2);
        reverse(s1);
        System.out.println(s1);
    }
}
