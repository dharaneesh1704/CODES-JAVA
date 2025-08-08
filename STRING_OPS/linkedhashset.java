import java.util.*;

class linkedhashset
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter the length: ");
        int len=sc.nextInt();

        int[] arr=new int[len];
        for(int i=0;i<len;i++)
        {
            arr[i]=sc.nextInt();
        }

        LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
        for(int x:arr)
        {
            set.add(x);
        }
        
        int temp[]=new int[set.size()];
        int g=0;
        for(int x:set)
        {
            temp[g++]=x;
            
        }
        System.out.print("result: ");
        for(int x:temp)
        {
            System.out.print(x+" ");   
        }
        
    }
}