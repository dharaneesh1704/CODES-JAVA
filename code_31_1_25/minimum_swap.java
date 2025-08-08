import java.util.*;
class minimum_swap
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length: ");
        
        int len=sc.nextInt();
        int arr[]=new int[len];
        System.out.println("enter the element: ");
        for(int i=0;i<len;i++)
        {
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<len/2;i++)
        {
            if(arr[len-1-i]==0)
            {
                int temp=arr[i];
                arr[i]=arr[len-1-i];
                arr[len-1-i]=temp;
                count++;
            }
            
        }
        
        System.out.print("output: "+count);
        
    
        
    }
}