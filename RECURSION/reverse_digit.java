import java.util.*;
class reverse_digit
{
    public static int reverse(int n,int res)
    {
        if(n==0)
            return res;
        res=(res*10)+(n%10);
        return reverse(n/10,res);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number : ");
        int n=sc.nextInt();
        int res=0;
        System.out.println(reverse(n,res));
    }
}