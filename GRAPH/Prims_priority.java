/*
 * /*A telecom company is tasked with restoring communication lines after a massive storm damaged their network in multiple cities.

They have a list of possible fiber-optic cable connections between cities, along with the cost of laying the cable.

The company’s goals are:

Reconnect all cities so that any city can communicate with any other city (directly or indirectly).

Minimize the total cost of laying cables.

Avoid cycles in the network to prevent data packet looping.

If there are multiple ways to achieve the same minimum cost, choose the one with more high-speed (priority) links.

Priority links are marked in the data with a flag (1 for high-speed, 0 for normal).

When comparing equal-cost MSTs, prefer the one with a greater count of high-speed links.

You must output:

The total cost of the selected network.

The list of edges (city1, city2, cost, priorityFlag) in the order they were added.
	
Test case 01 :

4 5
1 2 1 1
2 3 2 0
3 4 1 1
4 1 2 0
1 3 3 1

Total Cost: 4
Edges in MST:
1 2 1 1
3 4 1 1
2 3 2 0



Test case 02  :

5 6
1 2 3 0
2 3 4 0
3 4 2 0
4 5 6 0
1 5 5 0
2 5 4 0
Total Cost: 13
Edges in MST:
3 4 2 0
1 2 3 0
2 3 4 0
2 5 4 0

Test case 03 :

5 6
1 2 2 1
2 3 2 0
3 4 2 1
4 5 2 0
1 5 2 1
2 4 2 0
Total Cost: 8
Edges in MST:
1 2 2 1
3 4 2 1
1 5 2 1
2 3 2 0

 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Prims_priority 
{
    public static void main(String[] args) 
    {
        ArrayList<ArrayList<ArrayList<Integer>>> list=new ArrayList<>();
        
        int arr[][]={{0,1,1,1},{1,2,2,0},{2,3,1,1},{3,0,2,0},{0,2,3,1}};
        int V=4;
        for(int i=0;i<V;i++)
        {
            list.add(new ArrayList<>());
        }

        for(int i=0;i<arr.length;i++)
        {
            int u=arr[i][0];
            int v=arr[i][1];
            int w=arr[i][2];
            int p=arr[i][3];

            ArrayList<Integer> l1=new ArrayList<>();
            l1.add(v);
            l1.add(w);
            l1.add(p);

            ArrayList<Integer> l2=new ArrayList<>();
            l2.add(u);
            l2.add(w);
            l2.add(p);

            list.get(u).add(l1);
            list.get(v).add(l2);
        }

        System.out.println(list);

        PriorityQueue<ArrayList<Integer>> pq=new PriorityQueue<>(
            (a,b)-> {
                if(a.get(2)==b.get(2))
                    return b.get(3)-a.get(3);
                else    
                    return  a.get(2)-b.get(2);
                }
        );

        ArrayList<Integer> initial=new ArrayList<>();
        initial.add(0);
        initial.add(0);
        initial.add(-1);
        initial.add(0);
        pq.add(initial);

        int weight=0;
        HashSet<Integer> set=new HashSet<>();
        while(!pq.isEmpty())
        {
            ArrayList<Integer> temp=new ArrayList<>(pq.poll());
            int u=temp.get(0);
            int v=temp.get(1);
            int w=temp.get(2);
            int p=temp.get(3);
            
            if(!set.contains(u))
            {
                set.add(u);
                if(w!=-1)
                {
                    System.out.println(u+" -> "+v+" = "+w+"("+p+")");
                    weight+=w;
                }
                for(ArrayList<Integer> i:list.get(u))
                {
                    ArrayList<Integer> xx=new ArrayList<>();
                    xx.add(i.get(0));
                    xx.add(u);
                    xx.add(i.get(1));
                    xx.add(i.get(2));
                    pq.add(xx);
                }
            }
        }
        System.out.println("total weigth : "+weight);
    }
}