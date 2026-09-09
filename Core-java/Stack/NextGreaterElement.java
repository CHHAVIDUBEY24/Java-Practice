import java.util.*;

public class NextGreaterElement {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(Arrays.asList(6,8,0,1,3));
        Vector<Integer> ans = new Vector<>(v.size());
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<v.size();i++)
        {
            ans.add(0);
        }

        int i=v.size()-1;
        while(i>=0)
        {
            
            while(s.isEmpty() == false && v.get(i) >= v.get(s.peek()))
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                ans.set(i, -1);
            }
            else
            {
                ans.set(i, v.get(s.peek()));
               
            }
            s.push(i);
            i--;
        }
        for(int j: ans)
        {
            System.out.print(j+" ");
        }
        System.out.println();
    }
}
