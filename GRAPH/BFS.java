import java.util.*;
public class BFS 
{
    public static void main(String[] args) 
    {
         int[][] edgeList = {{0, 1},{0, 2},{2, 3},{1, 3},
                            {3, 4},{4, 5},{5, 6},{6, 7},
                            {7, 8},{8, 9},{9, 10},{10, 11},
                            {11, 12},{12, 13},{13, 14}};

        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for(int i = 0; i < edgeList.length; i++)
        {
            int u = edgeList[i][0];
            int v = edgeList[i][1];

            if(!map.containsKey(u))
                map.put(u, new ArrayList<>());
            map.get(u).add(v);

            if(!map.containsKey(v))
                map.put(v, new ArrayList<>());
            map.get(v).add(u);
        }

        System.out.println("Adjacency List: " + map);

        HashSet<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        visited.add(0);
        queue.add(0);
        while(!queue.isEmpty())
        {
            int node = queue.poll();
            System.out.print(node + " ");
            for(int i : map.get(node))
            {
                if(!visited.contains(i))
                {
                    visited.add(i);
                    queue.add(i);
                }
            }
        }
    }    
}
