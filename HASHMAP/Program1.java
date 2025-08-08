import java.util.*;

public class Program1 
{
    public static void main(String[] args) 
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int arr[]={1,2,3,4,5,6,6,1,2,3,4};
        for(int i:arr)
        {
            //containsKey
            if(map.containsKey(i))
                map.put(i, map.get(i)+1);
            else   
                map.put(i, 1);
                //map
        }
        System.out.println(map);

        //putall
        HashMap<Integer,Integer> map2=new HashMap<>();
        map2.putAll(map);
        System.out.println(map2);

        //containsValue
        boolean res=map.containsValue(1);
        System.out.println(res);

        //remove
        map.remove(2);
        System.out.println(map);

        //replace
        map.replace(3, 3333);
        System.out.println(map);

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
        for (Map.Entry<Integer, Integer> en : map.entrySet()) {
            Integer key = en.getKey();
            Integer val = en.getValue();
            System.out.println(key+" = "+val);
            
        }

        
    }    
}
