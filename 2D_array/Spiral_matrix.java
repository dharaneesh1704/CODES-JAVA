import java.util.Scanner;
//lettcode 24

public class Spiral_matrix 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of row and column: ");
        int row=sc.nextInt(),col=sc.nextInt();
        int arr[][]=new int[row][col];

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

       int t_row=0;
       int b_row=row-1;
       int l_col=0;
       int r_col=col-1;
       
       
       while(t_row <= b_row && l_col <= r_col)
       {
        
        for(int i=l_col;i<=r_col;i++)
        {
            System.out.print(arr[t_row][i]+" ");
        }
        t_row++;

        for(int i=t_row;i<=b_row;i++)
        {
            System.out.print(arr[i][r_col]+" ");
        }
        r_col--;

        if(t_row<=b_row){
        for(int i=r_col;i>=l_col;i--)
        {
            System.out.print(arr[b_row][i]+" ");
        }
        }
        b_row--;

        if(l_col<=r_col){
        for(int i=b_row;i>=t_row;i--)
        {
            System.out.print(arr[i][l_col]+" ");
        }
        } 
        l_col++;


       }
       
    }
}
