
import java.util.*;

public class Program2 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,String> map=new HashMap<>();
        
        map.put(1,"Arul");
        map.put(2, "Anbu");
        map.put(3, "Bala");
        map.put(4,"Ram");

        System.out.println(map.get(1).hashCode());
        System.out.println(map.get(2).hashCode());
        System.out.println(map.keySet().hashCode());
        System.out.println("map.Values hashcode: "+map.values().hashCode());

        HashMap<Integer,Integer> map2=new HashMap<>();
        map2.put(1,2);
        System.out.println("Integer value hashcode : "+map2.get(1).hashCode());
        
    }   

}