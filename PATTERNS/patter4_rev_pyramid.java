import java.util.Scanner;

public class patter4_rev_pyramid 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number : ");
        int n=sc.nextInt();

        for(int row=1;row<=n;row++)
        {
            for(int col=n;col>=n-row;col--)
            {
                System.out.print(" ");
            }

            for(int col=n;col>=row;col--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        


    }
}
