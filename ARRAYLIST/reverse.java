import java.util.*;
public class reverse 
{
    public static void main(String args[])    
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the length : ");
        int len=sc.nextInt();

        

        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<len;i++)
        {
            list.add(sc.nextInt());
        }

        
        //reverse
        for(int i=0;i<list.size()/2;i++)
        {
            int temp=list.get(i);
            list.set(i,list.get(len-1-i));
            list.set(len-1-i, temp);
    
        }


        

        System.out.println("the reverse element : ");
        for(int i:list)
            System.out.print(i+" ");
        
        System.out.println();
        
    }
}
