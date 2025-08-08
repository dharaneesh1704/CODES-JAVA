
import java.util.Scanner;


class array_ele_swap
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter the length of array: ");
        int len=sc.nextInt();

        int[] arr=new int[len];
        for(int i=0;i<len;i++)
        {
            System.out.println("enter the array element: ");
            arr[i]=sc.nextInt();

        }

        System.out.print("enter the index 1: ");
        int st=sc.nextInt();
        System.out.print("enter the index 2: ");
        int end=sc.nextInt();

        if(st>=0 && st<len && end>=0 && end<len)
        {
            int temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
            
            for(int i: arr)
            {
                System.out.print(i+" ");
            }
        }

        else
        {
            System.out.println("INVALID");
        }
    }
}