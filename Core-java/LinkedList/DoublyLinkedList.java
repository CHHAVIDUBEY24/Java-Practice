class Node
{
    int val;
    Node next;
    Node prev;
    Node(int val)
    {
        this.val=val;
        this.next=null;
        this.prev=null;
    }
}

class List
{
    public static Node pushAtEnd(Node head,int val)
    {
         Node newNode= new Node(val);
        if(head==null)
        {
            head=newNode;
        }
        else 
        {
            Node currNode=head;
            while(currNode.next!=null)
            {
                currNode=currNode.next;
            }
            currNode.next=newNode;
            newNode.prev=currNode;
            
        }
        return head;
    }

     public static Node pushAtFirst(Node head,int val)
    {
         Node newNode= new Node(val);
        if(head==null)
        {
            head=newNode;
        }
        else 
        {
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
        return head;
    }
 public static Node popFromEnd(Node head)
    {
        if(head==null || head.next==null)
        {
            return null;
        }
        else 
        {
            Node currNode=head;
            while(currNode.next!=null)
            {
                currNode=currNode.next;
            }
            currNode.prev.next=null;
            currNode.prev=null;
            
        }
        return head;
    }

     public static Node popFromStart(Node head)
    {
        if(head==null || head.next==null)
        {
            return null;
        }
        else 
        {
            Node currNode=head;
            head=head.next;
            head.prev=null;
            currNode.next=null;
            
        }
        return head;
    }

    public static void traverseList(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val);
             if(temp.next!=null){
            System.out.print("<->");
            }
            temp=temp.next;
        }
        System.out.println();
    }
}

public class DoublyLinkedList {
    
    public static void main(String[] args) {
        List l1=new List();
        Node head=l1.pushAtEnd(null, 0);
        head=l1.pushAtFirst(head,1);
        head=l1.pushAtFirst(head,2);
        head=l1.pushAtFirst(head,3);
        l1.pushAtEnd(head, 9);
        l1.traverseList(head);
        head=l1.popFromEnd(head);
        head=l1.popFromStart(head);
        l1.traverseList(head);

    }

    
}
