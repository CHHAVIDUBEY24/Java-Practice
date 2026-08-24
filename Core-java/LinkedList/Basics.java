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

public class Basics {
   
    public static void traverseList(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data);
            if(temp.next!=null)
            {
                System.out.print("->");
            }
            temp=temp.next;
        }
        System.out.println();

    }
    
    public static Node insertAtFirst(int data,Node head)
    {
        Node newNode= new Node(data);
        newNode.next=head;
        head=newNode;

        return head;
    }
    
    public static void insertAtEnd(int data,Node head)
    {
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=new Node(data);

    }
    public static Node deleteAtFirst(Node head)
    {
        if(head== null)
            return null;

        Node temp=head;
        head=head.next;
        temp.next=null;

        return head;
    }

    public static void deleteAtLast(Node head)
    {
        Node temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
    }
    public static boolean searchKey(Node head,int key)
    {
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data == key)
            {
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);

        traverseList(head);
        
        head=insertAtFirst(1,head);
        head=insertAtFirst(2, head);
        traverseList(head);

        insertAtEnd(4,head);
        insertAtEnd(5,head);
        traverseList(head);

        head=deleteAtFirst(head);
        traverseList(head);
        deleteAtLast(head);
        traverseList(head);

        
        if(searchKey(head,20))
            System.out.println("True");
        else
            System.out.println("False");

    }
}
