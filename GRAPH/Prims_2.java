import java.awt.geom.Line2D;
import java.util.*;
class Prims_2
{
    public static void main(String[] args) 
    {
        ArrayList<ArrayList<ArrayList<Integer>>> list=new ArrayList<>();
        int V=5;
        for(int i=0;i<V;i++)
        {
            list.add(new ArrayList<>());
        }
        
        int arr[][]={{0,1,1},{0,2,2},{1,2,3},{1,3,5},{3,4,4},{2,4,6}};
        for(int i=0;i<arr.length;i++)
        {
            int u=arr[i][0];
            int v=arr[i][1];
            int w=arr[i][2];
            
            ArrayList<Integer> l1=new ArrayList<>();
            l1.add(v);
            l2.add(w);
            list.get(u).add(l1);
            list.get(v).add(l2);
        }

        System.out.println(list);
    }
}