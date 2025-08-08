// change the rows and columns
import java.util.*;
class matrix_traversal
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the rows and columns: ");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        int res[][]=new int[col][row];

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        //trsversal
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                res[j][i]=arr[i][j];
            }
        }

        System.out.println("traversed matrix: ");
        for(int i=0;i<col;i++)
        {
            for(int j=0;j<row;j++)
            {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}