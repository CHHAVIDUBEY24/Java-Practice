class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}

public class Specific {
    public static void traverseList(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void insertAtPos(Node head,int data,int pos)
    {
        Node temp=head;
        int count=1;
        while(count+1!=pos)
        {
            temp=temp.next;
            count++;
        }
        Node newNode=new Node(data);
        newNode.next=temp.next;
        temp.next=newNode;        
    }
    public static Node deleteAtPos(Node head,int ind)
    {
        Node temp=head;

        if(ind==1) 
        {
            head=head.next;
            return head;
        }
        int count=1;
        while(count+1<ind)
        {
            temp=temp.next;
            count++;
        }
        temp.next=temp.next.next;
        return head;
    }
    
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);

        traverseList(head);
        insertAtPos(head,9,2);
        traverseList(head);
        head=deleteAtPos(head,4);
        traverseList(head);

    }
}
