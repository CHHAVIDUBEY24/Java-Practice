import java.util.ArrayList;


public class One {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();    

        int V = 4 ; 

        for(int i=0;i<V;i++)                                       // 0    (graph)
        {                                                          // 1 ---- 3
            graph.add(new ArrayList<>());                          // |
        }                                                          // |
                                                                   // 2
        graph.get(1).add(2);
        graph.get(2).add(1);

        graph.get(1).add(3);
        graph.get(3).add(1);

        System.out.println(graph);
    }
}
