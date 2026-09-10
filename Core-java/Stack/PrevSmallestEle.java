import java.util.*;

public class PrevSmallestEle {
    public static void main(String[] args) {
        Vector <Integer> v= new Vector<>(Arrays.asList(3,1,0,8,6));
        Vector <Integer> ans = new Vector<>(v.size());
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<v.size();i++)
        {
            ans.add(0);
        }
        int j=0;
        while(j<v.size())
        {
            while(!s.isEmpty() && v.get(j)<v.get(s.peek()))
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                ans.set(j,-1);
            }
            else
            {
                ans.set(j,v.get(s.peek()));
            }
            s.add(j);
            j++;
        }

        for(int i:ans)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
