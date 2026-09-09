import java.util.Arrays;
import java.util.Stack;
import java.util.Vector;

public class StockSpan {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(Arrays.asList(100,80,60,70,75,85));
        Vector<Integer> ans = new Vector<>(v.size());
        
        for (int k = 0; k < v.size(); k++) {
            ans.add(0); 
        }

        Stack <Integer> s= new Stack<>();

        int i=0;
        int n=v.size();

        while(i<n)
        {
            while(s.isEmpty() == false && v.get(i) >= v.get(s.peek()))
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                ans.set(i, i+1);
                s.push(i);
            }
            else
            {
                ans.set(i, i-s.peek());
                s.push(i);
            }
            i++;
        }
        for(int j: ans)
        {
            System.out.print(j +" ");
        }
        System.out.println();
    }
    
}
