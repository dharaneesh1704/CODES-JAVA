import java.util.*;
public class Detect_cycle 
{
    public static void main(String[] args) 
    {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=0;i<3;i++)
        {
            list.add(new ArrayList<>());
        }

        list.get(0).add(1);
        list.get(1).add(0);

        list.get(0).add(2);
        list.get(2).add(0);
                
        System.out.println(list);
        dfs(list);
        bfs(list);

    }    

    static void dfs(ArrayList<ArrayList<Integer>> list)
    {
        boolean res=true;
        Stack<Integer> stack=new Stack<>();
        HashSet<Integer> set=new HashSet<>();
        stack.add(0);
        while(!stack.isEmpty())
        {
            int q=stack.pop();
            if(!set.contains(q))
            {
                set.add(q);
                for(int i:list.get(q))
                {
                    stack.push(i);
                }
            }
            else
            {
                res=false;
                break;
            }
        }
        if(!res)
            System.out.println("no cycle detected in DFS");
        else    
            System.out.println("cycle detected in DFS");
    }

    static void bfs(ArrayList<ArrayList<Integer>> list)
    {
        boolean res=true;
        Queue<Integer> queue=new LinkedList<>();
        HashSet<Integer> set=new HashSet<>();
        queue.add(0);
        while(!queue.isEmpty())
        {
            int q=queue.poll();
            if(!set.contains(q))
            {
                set.add(q);
                for(int i:list.get(q))
                {
                    queue.add(i);
                }
            }
            else
            {
                res=false;
                break;
            }
            //System.out.println(queue);
        }
        if(!res)
            System.out.println("no cycle detected in BFS");
        else    
            System.out.println("cycle detected in BFS");
    }


}
