import java.util.*;
class Prims_2
{
    public static void main(String[] args) 
    {
        ArrayList<ArrayList<ArrayList<Integer>>> list=new ArrayList<>();
        int V=5;
        for(int i=0;i<V;i++)
        {
            list.add(new ArrayList<>());
        }
        
        int arr[][]={{0,1,1},{0,2,2},{1,2,3},{1,3,5},{3,4,4},{2,4,6}};
        for(int i=0;i<arr.length;i++)
        {
            int u=arr[i][0];
            int v=arr[i][1];
            int w=arr[i][2];
            
            ArrayList<Integer> l1=new ArrayList<>();
            ArrayList<Integer> l2=new ArrayList<>();
            l1.add(v);
            l1.add(w);

            l2.add(u);
            l2.add(w);
            list.get(u).add(l1);
            list.get(v).add(l2);
        }

        System.out.println(list);
        PriorityQueue<ArrayList<Integer>> pq=new PriorityQueue<>((a,b)->a.get(2)-b.get(2));
        ArrayList<Integer> xx=new ArrayList<>();
        xx.add(0);
        xx.add(0);
        xx.add(-1);
        pq.add(xx);

        int tot_weight=0;

        HashSet<Integer> set=new HashSet<>();
        while(!pq.isEmpty())
        {
            ArrayList<Integer> temp=new ArrayList<>(pq.poll());
            if(!set.contains(temp.get(0)))
            {
                set.add(temp.get(0));
                if(temp.get(2)!=-1)
                {
                    tot_weight+=temp.get(2);
                    System.out.println(temp.get(0)+" -> "+temp.get(1)+" - "+temp.get(2));
                }
                for(ArrayList<Integer> i:list.get(temp.get(0)))
                {
                    int u=temp.get(0);
                    int v=i.get(0);
                    int w=i.get(1);

                    ArrayList<Integer> qq=new ArrayList<>();
                    qq.add(v);
                    qq.add(u);
                    qq.add(w);
                    pq.add(qq);
                }
            }
        }
        System.out.println("total weight : "+tot_weight);
    }
}