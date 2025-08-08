
import java.util.Scanner;

public class patter5_slandingpyramid 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number : ");
        int n=sc.nextInt();

        for(int row=1;row<=n;row++)
        {
            for(int col=n;col>=row;col--)
            {
                System.out.print(" ");
                
            }
            for(int star=1;star<=n;star++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }    
}
