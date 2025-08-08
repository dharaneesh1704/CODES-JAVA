
import java.util.Scanner;

class factorial
{
    public static int fact(int num)
    {
        if(num==1)
            return 1;
        return num*(fact(num-1));    
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        int num=sc.nextInt();
        System.out.println("the factorial is : "+fact(num));
    }
}