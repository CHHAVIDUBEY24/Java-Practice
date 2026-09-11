import java.util.LinkedList;

public class Impl1 {
    public static class Node
    {
        int val;
        Node next;
        
        Node(int val)
        {
            this.val=val;
            this.next=null;
          
        }
    }
    public static class Queue
    {
        LinkedList<Integer> ll = new LinkedList<>();
        Node head;
        Node tail;

        Queue()
        {
            head=tail=null;
        }
        
        public void push(int val)
        {
            Node newNode=new Node(val);
            if(head==null)
            {
                head=tail=newNode;
            }
            else
            {
                tail.next=newNode;
                tail=tail.next;
            }
        }
        public void pop()
        {
            head=head.next;
        }
        public int front()
        {
            if(isEmpty())
            {
                return -1;
            }
            return head.val;
        
        }
         public int top()
        {
            if(isEmpty())
            {
                return -1;
            }
            return tail.val;
        
        }
        public boolean isEmpty()
        {
            return head==null;
        }

    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
        

        while(!q.isEmpty())
        {
            System.out.print(q.front()+" ");
            q.pop();
        }
        System.out.println();
    }
}
