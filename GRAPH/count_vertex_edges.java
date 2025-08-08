import java.util.*;
class Graph
{
    HashMap<Integer,HashSet<Integer>> map=new HashMap<>();
    public void addEdges(int u,int v)
    {
        if(!map.containsKey(u))
        {
            map.put(u,new HashSet<>());
            map.get(u).add(v);
        }
        else
        {
            map.get(u).add(v);
        }
        if(!map.containsKey(v))
        {
            map.put(v, new HashSet<>());
            map.get(v).add(u);
        }
        else
        {
            map.get(v).add(v);
        }
    }
    public void count()
    {
        int edge=0;
        int vertex=0;
        for(int i:map.keySet())
        {
            vertex++;
            edge+=map.get(i).size();
        }
        edge=edge/2;
        System.out.println(map);
        System.out.println("vertex : "+vertex);
        System.out.println("edges : "+edge);
    }

}
public class count_vertex_edges 
{
    public static void main(String[] args) 
    {
        int vertex=0;
        int edge=0;
        Graph g=new Graph();
        g.addEdges(0,1);
        g.addEdges(0, 3);
        g.addEdges(1, 2);
        g.addEdges(2,1);    

        g.count();
    }
}