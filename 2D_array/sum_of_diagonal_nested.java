
import java.util.Scanner;

//sum of diagonal in a square matrix (no of rows == no of columns)
//1 from left to right \
//2 from right to left /
// using nested loop
class sum_of_diagonal_nested
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row and col value: ");    
        int row=sc.nextInt();
        int col=sc.nextInt();

        int sum=0;
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
            for(int j=0;j<col;j++)
            {
                if(i==j)
                    sum+=arr[i][j];
            }
        }

        System.out.println("the sum of diagnol from left to right : "+sum);

        sum=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(i+j==(row-1))
                    sum+=arr[i][j];
            }
        }
        System.out.println("the sum of the diagonal from the right to left is : "+sum);
    }
}