import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class DeleteStackMid {
    public static void main(String[] args) {
        Deque <Integer> dq = new ArrayDeque<>(Arrays.asList(0,1,2,3,4,5,6,7));
        int mid=(dq.size()+1)/2;
        deleteEle(dq,mid);
        System.out.println(dq);
    }
    public static void deleteEle(Deque<Integer> dq,int mid)
    {
        if(dq.size()==0)
        {
            return;
        }
        if(mid==1)
        {
            dq.pop();
        }
        int val=dq.peek();
        dq.pop();
        deleteEle(dq, mid-1);
        dq.add(val);
    }
}
