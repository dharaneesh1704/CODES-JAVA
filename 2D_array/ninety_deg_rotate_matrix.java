import java.util.Scanner;
//logic: transpose the array and reverse the element in the row
public class ninety_deg_rotate_matrix 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in)    ;
        System.out.println("Enter the row and column: ");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        System.out.println("enter the matrix---------");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        
        //transpose
        for(int i=0;i<row;i++)
        {
            for(int j=i+1;j<col;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        System.out.println("the transpose matrix--------------------");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col/2;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[i][col-1-j];
                arr[i][col-1-j]=temp;
            }
        }

        System.out.println("the result matrix--------------------");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();

    }    
}
