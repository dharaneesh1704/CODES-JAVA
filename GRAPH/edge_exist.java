//check wether the path exist and print all the neightbour nodes
import java.util.*;
class Graph
{
    HashMap<Integer,HashSet<Integer>> map=new HashMap<>();
    Graph(int len) 
    {
        for(int i=0;i<len;i++)
        {
            map.put(i,new HashSet<Integer>());
        }
    }
    
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

    public void src_des(int src,int des)
    {
        Queue<Integer> queue=new LinkedList<>();
        HashSet<Integer> set=new HashSet<>();
        boolean flag=false;
        queue.add(src);
        set.add(src);
        while(!queue.isEmpty())
        {
            int n=queue.poll();
            if(n==des)
            {
                flag=true;
                break;
            }
            set.add(n);
            for(int i:map.get(n))
            {
                if(map.containsKey(i) && !set.contains(i))
                {
                    queue.add(i);
                    set.add(i);
                }
            }
        }
        if(flag)
            System.out.println("path exist");
        else
            System.out.println("not exist");
    }

    public void dis()
    {
        for(int i:map.keySet())
        {
            System.out.println(i+" : "+map.get(i));
        }
    }

}

public class edge_exist 
{
    public static void main(String[] args) 
    {
        Graph g=new Graph(5);
        g.addEdges(0,1);
        g.addEdges(0, 3);
        g.addEdges(1, 2);
        g.addEdges(2,1);
        
        g.src_des(1,4);
        g.dis();
    }
}
