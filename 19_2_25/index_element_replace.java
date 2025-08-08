//inverse array
import java.util.*;
class index_element_replace
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter the length: ");
        int len=sc.nextInt();
        int arr[]=new int[len];

        for(int i=0;i<len;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        int res[]=new int[len];
        for(int i=0;i<len;i++)
        {
            res[arr[i]]=i;
        }

        for(int i:res)
            System.out.print(i+" ");
        
    }
}