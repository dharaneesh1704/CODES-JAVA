//sum of the upper and the lower triangle in a matrix
import java.util.Scanner;
public class sum_of_upper_lower_triangle 
{
   public static void main(String[] args) 
   {
        Scanner sc=new Scanner(System.in)    ;
        
        System.out.println("Enter the number of row nad column: ");
        int row=sc.nextInt();
        int col=sc.nextInt();

        int arr[][]=new int[row][col];
        System.out.println("enter the matrix-------------");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        int upper=0;
        int lower=0;

        for(int i=0;i<row;i++)
        {
            for(int j=i;j<col;j++)
            {
                upper+=arr[i][j];
            }
        }
        System.out.println("the upper triangular sum: "+upper);

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<=i;j++)
            {
                lower+=arr[i][j];
            }
        }
        System.out.println("The lower triangular sum is: "+lower);

   }
    
}
