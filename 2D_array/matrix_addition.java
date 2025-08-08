//add the maxtix and its transpose without new matrix
// use only square matrix
import java.util.*;
class matrix_addition
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the row and column: ");
        int row=sc.nextInt();
        int col=sc.nextInt();
        System.out.println("enter the matrix");
        int arr[][]=new int[row][col];
        int res[][]=new int[row][col];

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                res[i][j]=arr[i][j]+arr[j][i];
            }
        }

        System.out.println("the result is-------------------------");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }

            
        
    }
}