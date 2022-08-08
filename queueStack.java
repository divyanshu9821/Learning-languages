import java.util.Stack;
public class queueStack {
    static class queue{
        static Stack<Integer> s1 = new Stack<Integer>();
        static Stack<Integer> s2 = new Stack<Integer>();

        public boolean queueIsEmpty(){
            return s1.isEmpty();
        }

        public void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }

            s1.push(data);

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        public int remove(){
            if(queueIsEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.pop();
        }

        public int peek(){
            if(queueIsEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.peek(); 
        }
    }

    public static void main(String[] args){
        queue q = new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while(!q.queueIsEmpty()){
            System.out.println(q.remove()) ;
        }
    }
}