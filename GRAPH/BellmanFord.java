public class BellmanFord 
{
    public static void main(String[] args) 
    {
        int arr[][]={{0,1,1},{0,2,4},{0,3,2},{1,4,3},{2,4,1},{3,4,5}};
        int V=5;
        int res[]=new int[V];
        for(int i=0;i<V;i++)
        {
            res[i]=Integer.MAX_VALUE;
        }
        res[0]=0;

        boolean dis=true;
        for(int i=0;i<V;i++)
        {
            for(int[] j:arr)
            {
                int u=j[0];
                int v=j[1];
                int w=j[2];

                if(res[u]!=Integer.MAX_VALUE && res[u]+w<res[v])
                {
                    res[v]=res[u]+v;
                    if(V-1==i)
                    {
                        System.out.println("Negative loop detected --------1");
                        dis=false;
                        break;
                    }
                    res[v]=res[u]+w;
                }
            }
        }
        if(dis)
        {
            for(int i=0;i<V;i++)
            {
                System.out.println("0 -> "+i+" = "+res[i]);
            }
        }
    }    
}
