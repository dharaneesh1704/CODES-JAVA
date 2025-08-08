
import java.util.HashMap;
import java.util.HashSet;

class Graph
{
    HashMap<Integer, HashSet<Integer>> map=new HashMap<>();
    Graph(int len)
    {
        for(int i=0;i<len;i++)
        {
            map.put(i, new HashSet<Integer>());
        }
    }

    public void addEdges(int u,int v)
    {
        map.get(u).add(v);
        map.get(v).add(u);
    }

    public void remove(int data)
    {
        for(int i:map.get(data))
        {
            //System.out.println(map.get(i));
            map.get(i).remove(data);
        }
        map.remove(data);
    }

    public void dis()
    {
        System.out.println(map);
    }
}

public class remove_vertex 
{
    public static void main(String[] args) 
    {
        Graph g=new Graph(5);
        g.addEdges(0,1);
        g.addEdges(0, 3);
        g.addEdges(1, 2);
        g.addEdges(2,1);
        g.dis();

        g.remove(1);
        g.dis();
        
    }    
}
