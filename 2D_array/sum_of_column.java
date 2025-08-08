import java.util.*;
class sum_of_column
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


        for(int i=0;i<col;i++)
        {
            int sum=0;
            for(int j=0;j<row;j++)
            {
                sum+=arr[j][i];
            }
            System.out.println("the sum of the "+i+" th column is : "+sum);
        }
    }
}