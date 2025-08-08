/*sample input and output
 * ip 4*4    o/p
 * 1 2 3 4    1 2 3 4
 * 5 6 7 8    8 7 6 5
 * 1 2 3 4    1 2 3 4
 * 5 6 7 8    8 7 6 5
 */
import java.util.Scanner;
public class zig_zag 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of row and column:");
        int row=sc.nextInt();
        int col=sc.nextInt();

        System.out.println("enter the matrix-------------------------");
        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        //print in zigzag
        System.out.println("result matrix------------------------------------");
        for(int i=0;i<row;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j<col;j++)
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
            else
            {
                for(int j=col-1;j>=0;j--)
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }    
}
