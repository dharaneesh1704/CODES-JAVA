
import java.util.Scanner;


class array_multiplication
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the length: ");
        int len=sc.nextInt();

        int[] arr=new int[len];
        for(int i=0;i<len;i++)
        {
            System.out.print("Enter the element: ");
            arr[i]=sc.nextInt();
        }

        int[] new_arr=new int[len];

        for(int i=0;i<len;i++)
        {
            int prod=1;
            for(int j=0;j<len;j++)
            {
                if(i==j)
                {
                    continue;
                }
                else
                {
                    prod*=arr[j];
                }
                
            }
            new_arr[i]=prod;
        }

        for(int i:new_arr)
        {
            System.out.print(i+" ");
        }
    }
}