import java.util.Scanner;
public class pattern6_sidepyr
{
    public static void main(String[] args) 
    {

    Scanner sc=new Scanner(System.in);
    System.out.print("enter the number : ");
    int n=sc.nextInt();

    for(int row=1;row<=n;row++)
    {
        for(int col=1;col<=row;col++)
        {
            System.out.print("* ");
        }
        System.out.println();
        
    }
    n-=1;
    for(int row=1;row<=n;row++)
    {
        for(int col=n;col>=row;col--)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
    
    }

}
