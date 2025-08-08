
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

/*Problem solving for the day - DFS

Detecting a Path Through Secret Tunnels (DFS)

In a dungeon game, players must navigate through underground tunnels to reach a hidden treasure room. Each tunnel connects two chambers (nodes), and not all chambers are directly connected. The dungeon map is represented as an undirected graph.

Your task is to use DFS (Depth-First Search) to determine whether a path exists from the Entrance Chamber to the Treasure Room.

Input :

Number of Chambers: 6
Tunnels:
0 <-> 1
0 <-> 2
1 <-> 3
3 <-> 4
4 <-> 5

Entrance: 0
Treasure: 5

Output :

Treasure Reachable

Test case 2 :

Number of Chambers: 5

Tunnels:
0 <-> 1
1 <-> 2
3 <-> 4

Entrance: 0
Treasure: 4

Output :

No Path to Treasure */

public class Treasure_dfs 
{
    public static void main(String[] args) 
    {
        
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=0;i<6;i++)
        {
            list.add(new ArrayList<>());
        }

        list.get(0).add(1);
        list.get(1).add(0);

        list.get(0).add(2);
        list.get(2).add(0);

        list.get(1).add(3);
        list.get(3).add(1);

        list.get(3).add(4);
        list.get(4).add(3);

        list.get(4).add(5);
        list.get(5).add(4);

        int st=0,end=5;
        Stack<Integer> stack=new Stack<>();
        HashSet<Integer> set=new HashSet<>();
        set.add(st);
        stack.push(st);
        boolean flag=false;
        while(!stack.isEmpty())
        {
            int n=stack.pop();
            if(n==end)
                flag=true;
            for(int i:list.get(n))
            {
                if(!set.contains(i))
                {
                    set.add(i);
                    stack.push(i);
                }
            }
        }

        if(flag)    
            System.out.println("treasure reached");
        else
            System.out.println("unable to reach the treasure");
    }    
}
