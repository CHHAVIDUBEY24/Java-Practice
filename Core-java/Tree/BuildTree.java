import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

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
        System.out.println("PreOrder Traversal: ");
        preOrder(root);  //root left right
        System.out.println("InOrder Traversal: ");   // this 3 follows DFS
        inOrder(root);  //left root right
        System.out.println("PostOrder Traversal: ");
        postOrder(root); // left right root
        System.out.println("LevelOrder Traversal: ");
        levelOrder(root); // BFS
        
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
    public static void inOrder(Node root)
    {
        if(root==null) return;
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }
    public static void postOrder(Node root)
    {
        if(root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }
    public static void levelOrder(Node root)
    {
        Queue<Node> q =new LinkedList<>();
        q.offer(root);
        q.offer(null);
        while(!q.isEmpty())
        {
            Node curr=q.peek();
            q.remove();
            
            if(curr==null)
            {
                if(!q.isEmpty())
                {
                    System.out.println();
                    q.offer(null);
                }
                else
                {
                    break;
                }
                continue;
            }
            System.out.print(curr.data+" ");
            if(curr.left!=null)
            q.offer(curr.left);
            if(curr.right!=null)
            q.offer(curr.right);
            
        }
        System.out.println();
    }
}
