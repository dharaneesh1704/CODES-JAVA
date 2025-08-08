import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Network_prims
{
    public static void main(String[] args) 
    {
        ArrayList<ArrayList<ArrayList<Integer>>> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);

        int V=26;
        for(int i=0;i<26;i++)
        {
            list.add(new ArrayList<>());
        }

        int edgelist=sc.nextInt();
        for(int i=0;i<edgelist;i++)
        {
            char a=sc.next().charAt(0);
            char b=sc.next().charAt(0);
            int w=sc.nextInt();
            int u=a-'a';
            int v=b-'a';
            ArrayList<Integer> l1=new ArrayList<>();
            l1.add(v);
            l1.add(w);

            ArrayList<Integer> l2=new ArrayList<>();
            l2.add(u);
            l2.add(w);

            list.get(u).add(l1);
            list.get(v).add(l2);

        }

        PriorityQueue<ArrayList<Integer>> pq=new PriorityQueue<>((a,b)->a.get(2)-b.get(2));
        ArrayList<Integer> qq=new ArrayList<>();
        char st=sc.next().charAt(0);
        qq.add((int)st-'a');
        qq.add((int)st-'a');
        qq.add(-1);
        pq.add(qq);

        HashSet<Integer> set=new HashSet<>();
        int weight=0;
        while(!pq.isEmpty())
        {
            ArrayList<Integer> temp=new ArrayList<>(pq.poll());
            int u=temp.get(0);
            int v=temp.get(1);
            int w=temp.get(2);
            
            if(!set.contains(u))
            {
                set.add(u);
                if(w!=-1)
                {
                    System.out.println((char)('a'+u)+" -> "+(char)('a'+v)+" = "+w);
                    weight+=w;
                }
                for(ArrayList<Integer> i:list.get(u))
                {
                    if(!set.contains(i.get(0)))
                    {
                        ArrayList<Integer> xx=new ArrayList<>();
                        xx.add(i.get(0));
                        xx.add(u);
                        xx.add(i.get(1));
                        pq.add(xx);
                    }
                }
            }
        }
       // System.out.println(list);
        System.out.println("total weight : "+weight);
    }    
}
