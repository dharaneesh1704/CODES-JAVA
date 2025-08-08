import java.util.*;
class natural_sum
{

    public static int sum(int num)
    {
        if(num>0)
            return num+(sum(num-1));
        return 0;
      
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        System.out.print(sum(num));
    }
}