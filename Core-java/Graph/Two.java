import java.util.*;

class Graph
{
    ArrayList<ArrayList<Integer>> ls = new ArrayList<>();
    int v;
    Graph(int v)
    {
        this.v=v;
        for(int i = 0; i < v; i++) 
        {
            ls.add(new ArrayList<>());
        }
    }
    void addEdge(int u,int v)
    {
        ls.get(u).add(v);
        ls.get(v).add(u);
    }
}
public class Two {
    public static void main(String[] args) {
    Graph g = new Graph(5);

    g.addEdge(2,1);
    g.addEdge(3,1);
    g.addEdge(4,2);
    g.addEdge(0,3);

    System.out.println(g.ls);
    }
   

}
