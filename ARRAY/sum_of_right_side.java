import java.util.Scanner;

class sum_of_right_side
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the length of array: ");
        int len=sc.nextInt();

        int[] arr=new int[len];
        for(int i=0;i<len;i++)
        {
            System.out.print("Enter the element: ");
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<len;i++)
        {
            int sum=0;
            for(int j=i+1;j<len;j++)
            {
                sum+=arr[j];
            }
            arr[i]=sum;
        }

        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}