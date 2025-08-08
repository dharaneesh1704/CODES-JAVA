
import java.util.Arrays;
import java.util.Comparator;

class Edge
{
    int u;
    int v;
    int w; 
    Edge(int u,int v,int w)
    {
        this.u=u;
        this.v=v;
        this.w=w;
    }
}

public class Railway_Kruskal_alg 
{
    static int[] parent;
    public static void main(String[] args) 
    {
        int V = 5;

        Edge[] edges = {
            new Edge(0, 1, 6),
            new Edge(0, 2, 1),
            new Edge(1, 2, 5),
            new Edge(1, 4, 3),
            new Edge(2, 3, 5),
            new Edge(3, 4, 2),
            new Edge(2, 4, 4)
        };

        Arrays.sort(edges,Comparator.comparingInt(e -> e.w));
        parent=new int[V];
        for(int i=0;i<V;i++)
        {
            parent[i]=i;
        }
        int weight=0;
        for(Edge i:edges)
        {
            int u=i.u;
            int v=i.v;
            int w=i.w;
            if(find(u)!=find(v))
            {
                union(u, v);
                weight+=w;
                System.out.println("Edge: " + u + " - " + v + " with weight: " + w);
            }
        }
        System.out.println("Total weight of MST: " + weight);
    }    

    public static int find(int x)
    {
        if(parent[x]!=x)
        {
            parent[x]=find(parent[x]);
        }
        return parent[x];
    }

    public static void union (int u,int v)
    {
        int pu=find(u);
        int pv=find(v);
        parent[pu]=pv;
    }
}
