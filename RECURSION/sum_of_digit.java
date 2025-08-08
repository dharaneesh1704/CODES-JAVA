import java.util.*;

class sum_of_digit
{
    public static int digit(int n)
    {
        if(n==0)
            return n;
        return (n%10)+digit(n/10);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        int n=sc.nextInt();
        System.out.println(digit(n));

    }
}