import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class ReverseStack {
    public static void main(String[] args) {
        Deque<Integer> dq=new ArrayDeque<>(Arrays.asList(1,2,3,4,5));
        reverseStack(dq);
        System.out.println(dq);
    }
    public static void reverseStack(Deque<Integer> dq)
    {
        if(dq.size()==1)
        {
            return;
        }
        int temp=dq.peek();
        dq.pop();
        reverseStack(dq);
        insertStack(dq,temp);
        
    }
    public static void insertStack(Deque<Integer> dq,int temp)
    {
        if(dq.isEmpty())
        {
            dq.push(temp);
            return;
        }
        int val=dq.peek();
        dq.pop();
        insertStack(dq, temp);
        dq.push(val);
    }

}
