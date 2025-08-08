import java.util.*;
public class sum_of_prime 
{
    public static boolean p(int n)
    {
        if(n<2)
            return false;
        if(n==2)    
            return true;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String args[])    
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the starting and the ending number : ");
        int st=sc.nextInt(),end=sc.nextInt();
        int len=(end-st)/2;
        int arr[]=new int[len+1];

        int ind=0;
        for(int i=st;i<=end;i++)
        {
            if(i%2==0)
                arr[ind++]=i;
        }

        for(int i=0;i<arr.length;i++)
        {
            for(int j=2;j<=arr[i]/2;j++)
            {
                if(p(j) && p(arr[i]-j))
                {
                    System.out.println(arr[i]+" = "+(arr[i]-j)+" + "+j);
                    break;
                }
            }
        }
    }
}
