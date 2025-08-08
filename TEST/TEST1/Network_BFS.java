import java.util.*;
public class Network_BFS 
{
    public static void main(String[] args) 
    {
        HashMap<Character,ArrayList<Character>> map=new HashMap<>();
        Scanner sc=new Scanner(System.in);

        int edgelist=sc.nextInt();
        for(int i=0;i<edgelist;i++)
        {
            char a=sc.next().charAt(0);
            char b=sc.next().charAt(0);
            
            if(!map.containsKey(a))
            {
                map.put(a,new ArrayList<>());
                map.get(a).add(b);
            }
            else
            {
                map.get(a).add(b);
            }

            if(!map.containsKey(b))
            {
                map.put(b, new ArrayList<>());
                map.get(b).add(a);
            }
            else    
                map.get(b).add(a);
        }

        Queue<Character> queue=new LinkedList<>();
        HashSet<Character> set=new HashSet<>();
        char st=sc.next().charAt(0);
        queue.add(st);
        char arr[]=new char[map.size()];
        int ind=0;
        while(!queue.isEmpty())
        {
            char n=queue.poll();
            if(!set.contains(n))
            {
                arr[ind++]=n;
                set.add(n);
            }
            for(char i:map.get(n))
            {
                if(!set.contains(i))
                    queue.add(i);
            }
        }
        for(int i:arr)
            System.out.print((i)+" ");
    }
    
}
