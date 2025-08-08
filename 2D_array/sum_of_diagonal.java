//sum of diagonal in a square matrix (no of rows == no of columns)
//1 from left to right \
//2 from right to left /
// using single loop
import java.util.*;
class sum_of_diagonal
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row and column for the square matrix");
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

        int sum=0;
        for(int i=0;i<row;i++)
        {
            sum+=arr[i][i]; 
        
        }

        System.out.println("The sum of the diagonal left to right is : "+sum);

        sum=0;
        int ind=col-1;
        for(int i=0;i<row;i++)
        {
            sum+=arr[i][ind--];
        }
        System.out.println("the sum of the diagonal from the right to left is : "+sum);
    }
}

 