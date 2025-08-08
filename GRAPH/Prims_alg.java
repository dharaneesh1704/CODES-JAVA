//my own prims code
import java.util.*;
public class Prims_alg {

    public static void main(String[] args) 
    {
        ArrayList<ArrayList<ArrayList<Integer>>> list = new ArrayList<>();
        int V = 5;
        for (int i = 0; i < V; i++) 
        {
            list.add(new ArrayList<>());
        }
        int arr[][] = {{0, 1, 2}, {0, 3, 6}, {1, 3, 8}, {1, 2, 3}, {1, 4, 5}, {2, 4, 7}};
        for (int i = 0; i < arr.length; i++) 
        {
            int u = arr[i][0];
            int v = arr[i][1];
            int w = arr[i][2];

            ArrayList<Integer> l1 = new ArrayList<>();
            ArrayList<Integer> l2 = new ArrayList<>();

            l1.add(v);
            l1.add(w);

            l2.add(u);
            l2.add(w);

            list.get(u).add(l1);
            list.get(v).add(l2);
        }

        System.out.println(list);
        PriorityQueue<ArrayList<Integer>> pq = new PriorityQueue<>((a, b) -> a.get(2)- b.get(2));

        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(0);
        temp.add(0);
        temp.add(-1);
        pq.add(temp);

        int short_weight = 0;
        while (!pq.isEmpty()) 
        {
            ArrayList<Integer> curr = new ArrayList<>(pq.poll());
            int u = curr.get(0);
            int v = curr.get(1);
            int w = curr.get(2);
    
            if(!set.contains(u)) 
            {
                set.add(u);
                if (w != -1) 
                {
                    System.out.println(u + "->" + v + " weight(" + w + ")");
                    short_weight += w;
                }
                for (ArrayList<Integer> i : list.get(u)) 
                {
                    if (!set.contains(i.get(0))) 
                    {
                        ArrayList<Integer> x = new ArrayList<>();
                        x.add(i.get(0));
                        x.add(u);                       
                        x.add(i.get(1));
                        pq.add(x);
                    }
                }
            }
        }
        System.out.println("total short distance : "+short_weight);
    }
}
