//print from 1 to n
//head recursion
import java.util.*;
class sample_resursion
{   
    public static void print(int num)
    {
        
        if(num==1)
        {
            System.out.println(num);
        }
        else
        {
            print(num-1);
            System.out.println(num);
        }

    }


    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");
        int num=sc.nextInt();
        print(num);

    }
}