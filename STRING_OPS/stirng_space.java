
import java.util.Scanner;


class stirng_space
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in)    ;
        System.out.print("Enter the sting: ");
        String s=sc.next();
        
        System.err.println("string space");
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            System.out.print(c+" ");
        }
        System.out.println();
        System.err.println("reverse string");
        for(int i=s.length()-1;i>=0;i--)
        {
            char c=s.charAt(i);
            System.out.print(c);
        }
    }
}