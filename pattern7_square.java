import java.util.Scanner;
public class pattern7_square 
{

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number : ");
        int n=sc.nextInt();

        //for(int row=1;row<=n;row++)
        
            for(int col=1;col<=n;col++)
            {
                System.out.print("* ");
            }
            System.out.println();    
        
        
            for(int col=1;col<n-1;col++)
            {
                System.out.print("*");
                for(int sp=1;sp<=2*(n)-3;sp++)
                {
                    System.out.print(" ");

                }
                System.out.print("*");
                System.out.println();
            }
            
        

        
            for(int col=1;col<=n;col++)
            {
                System.out.print("* ");
                
            }
            
        
        

    }
}
