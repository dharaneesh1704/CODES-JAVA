
import java.util.Scanner;
//MY CODE----------------------------------------------------can't pass some test cases
/*
Given 2 integers A & B and an array of integers C of size N. Elements C[I] represents the length of
I th board.

You have to paint all N boards [C0, C1, C2, C3, ........, CN-1]. There are A painters available and
each of them takes B unit of time to paint 1 unit of board.

Calculate and return the minimum time required to paint all the boards under the constraint that
any painter will only pain continuous selection of board.

2 painters cannot share a board to paint. That is to say, a board cannot be painted partially by
one painter, and partially by another.

A painter will only paint continuous boards. Which means configuration where painter 1 paints
boards 1 and 3 but not 2 is invalid.

In this scenario similar to the book allocation question, the allocation is made in a continuous
manner and hence we can use the binary search.
*/
public class painter_allocation 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        int n=sc.nextInt();
        System.out.println("enter the number of painter");
        int a=sc.nextInt();
        System.out.println("enter the unit fo time");
        int b=sc.nextInt();
        System.out.println("enter the unit of board");
        int arr[]=new int[n];

        int sum=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
              
        int pre[] =new int[n];
        int suff[]=new int[n];

        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            pre[i]=sum;
        }

        sum=0;
        for(int i=n-1;i>=0;i--)
        {
            sum+=arr[i];
            suff[i]=sum;
            

        }

        //  for(int i:pre)
        //     System.out.print(i+" ");
        //  System.out.println("");    
        //  for(int i:suff)
        //      System.out.print(i+" ");
        
        int div=1;
        if(a>1)
            div=a-1;
        
        int res=0;
        int diff=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            suff[i]=suff[i]/div;
            int num=Math.max(pre[i],suff[i]);
            int sub=pre[i]-suff[i];
            if(diff>Math.abs(sub))
            {
                diff=Math.abs(sub);
                res=Math.min(suff[i],pre[i]);
            }

        }

        
        for(int i=0;i<arr.length;i++)
        {
            if(res<arr[i])
            {
                res=arr[i];
            }
        }
        System.out.println("maximum unit of the board is: "+res);
        System.out.println("total time requird is : "+(res*b));
        
    }
}
