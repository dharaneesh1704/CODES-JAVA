
import java.util.Scanner;
public class matrix_multiplication 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter the row and col for matrix 1:");
        int r1=sc.nextInt(),c1=sc.nextInt();
        int arr1[][]=new int[r1][c1];
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }

        System.out.println("enter the row and col for matrix 2:");
        int r2=sc.nextInt(),c2=sc.nextInt();
        int arr2[][]=new int[r2][c2];
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                arr2[i][j]=sc.nextInt();
            }
        }

        if(c1!=r2)
            System.out.print("the matric can't be multiplied");
        else
        {
            int res[][]=new int[r1][c2];

            for(int i=0;i<r1;i++)
            {
                    for(int j=0;j<c2;j++)
                    {
                        for(int k=0;k<r2;k++)
                        {
                            res[i][j]+=arr1[i][k]*arr2[k][j];
                        }
                    }
            }

            System.out.println("result---------------------------");

            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c2;j++)
                {
                    System.out.print(res[i][j]+" ");
                }
                System.out.println();
            }
        }    
    
    }    
}
