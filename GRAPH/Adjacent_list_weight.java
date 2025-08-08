import java.util.ArrayList;
import java.util.HashMap;
// online gdb : MsAdurWVRr using class node
public class Adjacent_list_weight 
{
    public static void main(String[] args) 
    {
        HashMap<Integer,ArrayList<ArrayList<Integer>>> map=new HashMap<>();
        int arr[][]={{0,1,4},{1,2,5},{2,0,6}};

        for(int i=0;i<3;i++)
        {
            map.put(i,new ArrayList<ArrayList<Integer>>());
        }
        
        for(int i=0;i<arr.length;i++)
        {
            int u=arr[i][0],v=arr[i][1],w=arr[i][2];
            ArrayList<Integer> l1=new ArrayList<>();
            ArrayList<Integer>l2=new ArrayList<>();
            
            l1.add(v);
            l1.add(w);
            map.get(u).add(l1);

            l2.add(u);
            l2.add(w);
            map.get(v).add(l2);
        }

        System.out.println(map);
        for(int i:map.keySet())
        {
            for(int j=0;j<map.get(i).size();j++)
            {
                int u=i;
                int v=map.get(i).get(j).get(0);
                int w=map.get(i).get(j).get(1);
                System.out.println(u+" -> "+v+" == "+w);
            }
        }

    }
}
