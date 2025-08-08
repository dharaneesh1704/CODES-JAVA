import java.util.*;
class graph
{
    ArrayList<ArrayList<Integer>> list=new ArrayList<>();
    graph(int size)
    {
        for(int i=0;i<size;i++)
        {
            list.add(new ArrayList<Integer>());
        }
    }
    public void addEdge(int u,int v)
    {
        list.get(u).add(v);
        list.get(v).add(u);
    }
    public void display()
    {
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
    }

    public ArrayList<Integer> BFS()
    {
        ArrayList<Integer> l=new ArrayList<>();
        Queue<Integer> queue=new LinkedList<>();
        HashSet<Integer> set=new HashSet<>();
        queue.add(0);
        set.add(0);
        
        while(!queue.isEmpty())
        {   
            int n=queue.poll();
            l.add(n);
            for(int i:list.get(n))
            {
                if(!set.contains(i))
                {
                    queue.add(i);
                    set.add(i);
                }
            }
        }   
        return l;
    }

    public ArrayList<Integer> DFS()
    {
        ArrayList<Integer> l=new ArrayList<>();
        Stack<Integer> stack=new Stack<>();
        HashSet<Integer> set=new HashSet<>();
        stack.push(0);
        set.add(0);
        while(!stack.isEmpty())
        {   
            int n=stack.pop();
            l.add(n);
            for(int i:list.get(n))
            {
                if(!set.contains(i))
                {
                    stack.push(i);
                    set.add(i);
                }
            }
        }   
        return l;
    }
}

public class Graph_implementation
{
    public static void main(String[] args) 
    {
        graph g=new graph(5);
        
        g.addEdge(0, 1);
        g.addEdge(0,3);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(3,4);
        g.addEdge(2, 4);

        g.display();      
        System.out.println();
        
        ArrayList<Integer> bfs=new ArrayList<>(g.BFS());
        ArrayList<Integer> dfs=new ArrayList<>(g.DFS());

        System.out.println("BFS---");
        for(int i:bfs)
            System.out.print(i+" ");
        System.out.println();

        System.out.println("DFS---");
        for(int i:dfs)
            System.out.print(i+" ");
        System.out.println();
    }
}