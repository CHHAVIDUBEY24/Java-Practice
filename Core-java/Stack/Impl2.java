import java.util.LinkedList;

public class Impl2 {
    public static class Stack
    {
        LinkedList<Integer> l=new LinkedList<>();
        
        public void push(int val)
        {
            l.addFirst(val);
        }
        public void pop()
        {
            l.removeFirst();
        }
        public Object top()
        {
            return l.getFirst();
        }
        public boolean isEmpty()
        {
            return l.size()==0;
        }
    }
    public static void main(String[] args)
    {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while (!s.isEmpty()) {
            System.out.println(s.top());
            s.pop();
        }
    }
}
