import java.util.ArrayList;
import java.util.List;

public class pascal_triangle 
{
    
    public static List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> list=new ArrayList<>();
        
        for(int i=1;i<=numRows;i++)
        {
            List<Integer> small=new ArrayList<>();
            if(i==1)
                small.add(1);
            else if(i==2)    
            {
                small.add(1);
                small.add(1);
            }
            else
            {
                small.add(1);
                for(int j=1;j<i-1;j++)
                {
                   small.add(list.get(i-2).get(j-1) + list.get(i-2).get(j));

                }
                small.add(1);
            }


            list.add(small);

            
        }
        


        return list;
    }

    public static void main(String[] args) {
        
        System.out.println(generate(6));
    }


}    


