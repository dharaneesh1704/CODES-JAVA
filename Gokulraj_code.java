import java.util.*;
public class Gokulraj_code {
    public static void main(String[] args) {
       int[]arr={1,2,2,3,3,4,5,6,7,7,8,8};
       HashSet<Integer>list=new HashSet<>();
       for(int n:arr){
        list.add(n);
       }
      int res[]=new int[list.size()];
      int ind=0;
      for(int i:list)
       res[ind++]=i;

      //print
      for(int i:res) 
       System.out.print(i+" ");
    
    }
       }
    
