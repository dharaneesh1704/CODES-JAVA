import java.util.*;

public class Adjacency_List_undirected 
{
    public static void main(String[] args) 
    {
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();   

        int[][] edgeList = {{0, 1},{0, 2},{2, 3},{1, 3}};


    //undirected graph
    for(int i=0;i<edgeList.length;i++)
    {
        int u=edgeList[i][0];
        int v=edgeList[i][1];

        
        if(!map.containsKey(u))
            map.put(u,new ArrayList<>());
        map.get(u).add(v);

        
        if(!map.containsKey(v))
            map.put(v,new ArrayList<>());
        map.get(v).add(u);
    }

    System.out.println(map);



    }    

    
    

    
}
