import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SortStackRec {
    public static void main(String[] args)
    {
        Deque<Integer> dq=new ArrayDeque<>(Arrays.asList(1,8,5,4,2));
        sortStack(dq);
        System.out.println(dq);
    }
    public static void sortStack(Deque<Integer> dq)
    {
        if(dq.size()==1)
        {
            return;
        }
        int val=dq.peek();
        dq.pop();
        sortStack(dq);
        insertF(dq,val);
    }
    public static void insertF(Deque<Integer> dq,int val)
    {
        if(dq.size()==0 || dq.peek()<=val)
        {
            dq.push(val);
            return;
        }
        int lastVal=dq.peek();
        dq.pop();
        insertF(dq, val);
        dq.push(lastVal);
    }

}
