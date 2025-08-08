import java.util.*;
class move_zero_last
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int arr[]=new int[len];
        for(int i=0;i<len;i++)
        {
            arr[i]=sc.nextInt();
        }

        int p1=0,p2=0;
        while(p2<len)
        {
            if(arr[p2]!=0)
            {
                int temp=arr[p1];
                arr[p1]=arr[p2];
                arr[p2]=temp;
                p1++;
                p2++;
                
            }
            else
            {
                p2++;
            }
        
                     
        }

        for(int i:arr)
            System.out.print(i+" ");
    }
}