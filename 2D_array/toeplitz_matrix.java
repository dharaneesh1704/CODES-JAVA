
import java.util.Scanner;

//check wheter all the diagonal has the same value
public class toeplitz_matrix 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of row and column: ");
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

        //logic
        boolean flag=true;
        for(int i=0;i<row-1;i++)
        {
            for(int j=0;j<col-1;j++)
            {
                if(arr[i][j]!=arr[i+1][j+1])
                {
                    flag=false;
                    break;
                }
            }
            if(!flag)
                break;
        }
        if(flag)
            System.out.println("toeplitz matrix");
        else
            System.out.println("not a toeplitz matirx");    
        
    }
}
