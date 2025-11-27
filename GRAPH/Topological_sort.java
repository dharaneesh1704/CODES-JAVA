import java.util.*;
class Topological_sort
{
    public static void main(String[] args) 
    {
        int n=5;
        int[][] edges = {
        {1, 2},
        {1, 3},
        {2, 4},
        {2, 5},
        {3, 5}
        };

        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            list.add(new ArrayList<>());
        }    

        int deg[]=new int[n];
        for(int i=0;i<edges.length;i++)
        {
            int u=edges[i][0];
            int v=edges[i][1];

            deg[v-1]++;

            list.get(u-1).add(v-1);
        }
        System.out.println(list);
        System.out.print("indegree array:-----");
        for(int i:deg)
            System.out.print(i+" ");;
        
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<deg.length;i++)
        {
            if(deg[i]==0)
                queue.add(i);
        }

        int res[]=new int[n];
        int ind=0;
        while(!queue.isEmpty())
        {
            int x=queue.poll();
            res[ind++]=x;
            for(int i:list.get(x))
            {
                deg[i]--;
                if(deg[i]==0)
                    queue.add(i);
            }
        }

        System.out.println();
        System.out.println("The result is :::----");
        for(int i:res)
            System.out.print((i+1)+" ");
    }
}