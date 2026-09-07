import java.util.Vector;

public class Impl1 {
    public static class  Stack1
    {
        Vector<Integer> v= new Vector<>();
        int top=0;

        public

        int top()
        {
            return v.get(v.size()-1); //O(1)
        }
        void push(int ele)                   
        {
            v.add(ele);               //O(1)
            top++;
        }
        void pop()
        {
            v.remove(v.size()-1);    //O(1)
            top--;
        }
        boolean isEmpty()
        {
            return v.size()==0;      //O(1)
        }

    }
    public static void main(String[] args) {
        Stack1 s = new Stack1();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while(!s.isEmpty())
        {
            System.out.print(s.top()+" ");
            s.pop();
        }
        System.out.println();
    }

}
