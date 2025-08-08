import java.util.*;


public class DFS_recursion 
{
    static void dfs(int node, HashSet<Integer> visited, HashMap<Integer, ArrayList<Integer>> map) 
    {
        visited.add(node);
        System.out.print(node + " ");
        
        for(int neighbor : map.get(node)) 
        {
            if(!visited.contains(neighbor)) 
            {
                dfs(neighbor, visited, map);
            }
        }
    }
    public static void main(String[] args) 
    {
         int[][] edgeList = {{0, 1}, {0, 2}, {1, 3}, {1, 4}, {2, 5}};    
         HashSet<Integer> visited = new HashSet<>();
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
            System.out.print("DFS Traversal: ");
            dfs(0, visited, map); // Start DFS from node 0

    }    
}
