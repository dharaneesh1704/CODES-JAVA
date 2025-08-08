import java.util.Scanner;

class arr_reverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the length: ");
        int len=sc.nextInt();

        int[] arr=new int[len];
        int[] rev=new int[len];

        for(int i=0;i<len;i++)
        {
            System.out.println("enter the array element: ");
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<len;i++)
        {
            rev[len-1-i]=arr[i];
        }

        for(int i:rev)
        {
            System.out.print(i+" ");
        }
    }
}