import java.util.*;
class sum_of_row
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter the number of rows: ");
        int row=sc.nextInt();

        System.out.println("enter the number of columns: ");
        int col=sc.nextInt();

        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }


        for(int i=0;i<row;i++)
        {
            int sum=0;
            for(int j=0;j<col;j++)
            {
                sum+=arr[i][j];
            }
            System.out.println("the sum of the "+i+" th row is : "+sum);
        }
    }
}