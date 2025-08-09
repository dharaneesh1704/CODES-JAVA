
import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;

/*A delivery company operates in a city where locations are connected by roads with different travel times (in minutes).

The company wants to determine the shortest delivery time from its main warehouse to all other locations in the city.

However, due to traffic restrictions:

Travel times between some locations may be different in each direction.

Some locations are not directly connected.

You are given:

V → Total number of locations (numbered from 0 to V-1)

A list of roads in the form (source, destination, travel_time)

A start location representing the warehouse.

Your task:

Using Dijkstra’s Algorithm, calculate the shortest delivery time from the warehouse to every location in the city.

If a location is unreachable, mark its delivery time as "INF".

Input :

V = 6
roads = [
    (0, 1, 7),
    (0, 2, 9),
    (0, 5, 14),
    (1, 2, 10),
    (1, 3, 15),
    (2, 3, 11),
    (2, 5, 2),
    (3, 4, 6),
    (4, 5, 9)
]
start = 0

Output :

Shortest delivery times from warehouse (0):
Location 0 → 0 minutes
Location 1 → 7 minutes
Location 2 → 9 minutes
Location 3 → 20 minutes
Location 4 → 20 minutes
Location 5 → 11 minutes

*/
public class delivery_person 
{
    public static void main(String[] args) 
    {
        int V=6;
        int arr[][]={{0,1,7},{0,2,9},{0,5,14},{1,2,10},{1,3,15},{2,3,11},{2,5,2},{3,4,6},{4,5,9}};
        int st=0;

        ArrayList<ArrayList<ArrayList<Integer>>> list=new ArrayList<>();
        for(int i=0;i<V;i++)
        {
            list.add(new ArrayList<>());
        }

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

        PriorityQueue<ArrayList<Integer>> pq=new PriorityQueue<>((a,b)->a.get(2)-b.get(2));
        
        ArrayList<Integer> initial=new ArrayList<>();
        initial.add(st);
        initial.add(0);
        initial.add(-1);
        pq.add(initial);

        int res[]=new int[V];
        for(int i=0;i<V;i++)
        {
            res[i]=Integer.MAX_VALUE;
        }
        res[0]=0;
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

                    if(res[u]!=Integer.MAX_VALUE && res[u]+new_w<res[new_v])
                    {
                        res[new_v]=res[u]+new_w;
                        ArrayList<Integer> xx=new ArrayList<>();
                        xx.add(new_v);
                        xx.add(u);
                        xx.add(res[u]+new_w);

                        pq.add(xx);
                    }
                }
            }
        }
        
        for(int i=0;i<V;i++)
        {
            if(res[i]!=Integer.MAX_VALUE)
                System.out.println(st+" -> "+i+" = "+res[i]);
            else
                System.out.println(st+" -> "+i+" = path not exist");
        }
    }    
}
