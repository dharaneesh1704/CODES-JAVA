import java.util.*;
public class City_navigation 
{
    public static void main(String[] args) 
    {
        //create a graph with adjacency list and find a path exist from the source to the destination using BFS
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            list.add(new ArrayList<Integer>());
        }
        
        list.get(0).add(1);
        list.get(0).add(3);

        list.get(1).add(0);
        list.get(1).add(2);
        list.get(1).add(3);

        list.get(2).add(1);
        list.get(2).add(4);

        list.get(3).add(0);
        list.get(3).add(1);
        list.get(3).add(4);

        list.get(4).add(3);
        list.get(4).add(2);

        System.out.println(list);
        
        Queue<Integer> queue=new LinkedList<>();
        HashSet<Integer> set=new HashSet<>();
        
        //source and destination//
        int source=0,destination=3;
        
        set.add(source);
        queue.add(source);

        boolean flag=false;
        while(!queue.isEmpty())
        {
            int n=queue.poll();
            if(n==destination)
                flag=true;
            for(int i:list.get(n))
            {
                if(!set.contains(i))
                {
                    queue.add(i);
                    set.add(i);
                }
                
            }
        }

        if(flag)
            System.out.println("path exist");
        else    
            System.out.println("path does not exist");
    }    
}
