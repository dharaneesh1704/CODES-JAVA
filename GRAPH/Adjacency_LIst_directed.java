import java.util.*;
public class Adjacency_LIst_directed {
    
    public static void main(String[] args) 
    {
          int[][] edgeList = {{0, 1},{1, 2},{2, 0}};
          HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

          //directed graph
          for(int i = 0; i < edgeList.length; i++)
          {
              int u = edgeList[i][0];
              int v = edgeList[i][1];

           
              if(!map.containsKey(u))
                  map.put(u, new ArrayList<>());
              map.get(u).add(v);
              
           
          }
          System.out.println(map);
        
    }
}
