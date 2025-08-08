
import java.util.Scanner;

public class print_outer_bound 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row and column: ");
        int row=sc.nextInt();
        int col=sc.nextInt();

        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("result-------------------------------------");
        
        for(int i=0;i<col;i++)
        {
            System.out.print(arr[0][i]+" ");
        }

        for(int i=1;i<row-1;i++)
        {
            System.out.print(arr[i][col-1]+" ");
        }

        for(int i=col-1;i>=0;i--)
        {
            System.err.print(arr[row-1][i]+" ");
        }
        
        for(int i=row-2;i>0;i--)
        {
            System.out.print(arr[i][0]+" ");
        }

    }    
}
