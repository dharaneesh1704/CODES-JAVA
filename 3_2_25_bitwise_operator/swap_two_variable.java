
import java.util.Scanner;

class swap_two_variable
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in)    ;
        
        System.out.println("Enter the variable 1: ");
        int n1=sc.nextInt();
        System.out.println("Enter the variable 2: ");
        int n2=sc.nextInt();

        n1= n1 | n2;
        n2=n1 & n2;
        n1=n1 ^ n2;
        System.out.println(n1+" "+n2);

    }
}