import java.util.*;

class Graph
{
    ArrayList<ArrayList<Integer>> ls = new ArrayList<>();
    int v;
    boolean[] visited;
    boolean[] visited1;
    Graph(int v)
    {
        this.v=v;
        visited=new boolean[v];
        visited1 = new boolean[v];
        for(int i = 0; i < v; i++) 
        {
            ls.add(new ArrayList<>());
        }
    }
    
   
    void addEdge(int a,int b)
    {
        ls.get(a).add(b);
        ls.get(b).add(a);
    }

    void bfs()
    {
    Queue<Integer> q = new LinkedList<>();
    

    q.add(0);
    visited[0] = true;

    while(!q.isEmpty())
    {
        int u = q.poll();
        System.out.print(u + " ");

        for(int i : ls.get(u))
        {
            if(!visited[i])
            {
                visited[i] = true;
                q.add(i);
            }
        }
    }
}
    void dfs(int src)
    {
        visited1[src] = true;
        System.out.print(src+" ");
        for(int i : ls.get(src))
        {
            if(!visited1[i])
            {
            dfs(i);
            }
        }
        
    }
        
}
public class Two {
    public static void main(String[] args) {
    Graph g = new Graph(5);

    g.addEdge(2,1);
    g.addEdge(3,1);
    g.addEdge(4,2);
    g.addEdge(0,3);

    g.bfs();
    System.out.println();
    g.dfs(0);
    System.out.println();
    System.out.println(g.ls);

    }
   

}
