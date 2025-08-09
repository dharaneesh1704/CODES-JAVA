
import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;

class Dijkstra
{
    public static void main(String[] args) 
    {
        ArrayList<ArrayList<ArrayList<Integer>>> list=new ArrayList<>();
        int V=5;
        for(int i=0;i<V;i++)
        {
            list.add(new ArrayList<>());
        }

        int arr[][]={{0,1,1},{0,2,4},{0,3,2},{1,4,3},{2,4,1},{3,4,5}};
        for(int i=0;i<arr.length;i++)
        {
            int u=arr[i][0];
            int v=arr[i][1];
            int w=arr[i][2];
            ArrayList<Integer> l1=new ArrayList<>();
            ArrayList<Integer> l2=new ArrayList<>();

            l1.add(v);
            l1.add(w);
            list.get(u).add(l1);

            l2.add(u);
            l2.add(w);
            list.get(v).add(l2);
        }

        System.out.println(list);

        int dist[]=new int[V];
        for(int i=0;i<V;i++)
        {
            dist[i]=Integer.MAX_VALUE;
        }
        dist[0]=0;

        PriorityQueue<ArrayList<Integer>> pq=new PriorityQueue<>((a,b)->a.get(2)-b.get(2));
        ArrayList<Integer> initial=new ArrayList<>();
        initial.add(0);
        initial.add(0);
        initial.add(0);
        pq.add(initial);

        HashSet<Integer> set=new HashSet<>();
        while(!pq.isEmpty())
        {
            ArrayList<Integer> temp=new ArrayList<>(pq.poll());
            int u=temp.get(0);
            int v=temp.get(1);
            int w=temp.get(2);
            if(!set.contains(u))
            {
                set.add(u);
                for(ArrayList<Integer> i:list.get(u))
                {
                    int new_v=i.get(0);
                    int new_w=i.get(1);

                    if(dist[u]+new_w<dist[new_v])
                    {
                        dist[new_v]=dist[u]+new_w;
                        ArrayList<Integer> xx=new ArrayList<>();
                        xx.add(new_v);
                        xx.add(u);
                        xx.add(dist[new_v]);
                        pq.add(xx);
                    }
                }               
            }
        }

        for(int i=0;i<V;i++)
        {
            System.out.println("0->"+i+" = "+dist[i]);
        }
    }
}