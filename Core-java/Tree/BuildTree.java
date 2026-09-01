public class BuildTree {

public static class Node{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data=data;
        left=null;
        right=null;
    }
}
static int ind=-1;
   public static void main(String[] args) {
        
        int[] arr={1,2,-1,-1,3,4,5,-1,-1,-1,-1};
        Node root=tNode(arr);
        preOrder(root);  //root left right

    }

    
    public static Node tNode(int[] arr)
    {
        ind++;
        if(arr[ind]==-1)
        {
            return null;
        }
        
        Node curr=new Node(arr[ind]);
        curr.left=tNode(arr);
        curr.right=tNode(arr);
        return curr;
    }

    public static void preOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
}
