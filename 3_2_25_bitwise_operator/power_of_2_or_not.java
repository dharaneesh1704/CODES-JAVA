import java.util.*;
class power_of_2_or_not
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter the number: ");
        int num=sc.nextInt();

        // int count=0;
        // while(num!=0)
        // {
        //     if((num&1)==1)
        //     {
        //         count++;
        //     }

        //     num=num>>1;
        // }
        // if(count==1)
        //     System.out.println("power of two");
        // else    
        //     System.out.println("not a power of two");    

        //another method
        if((num &(num-1))==0)
            System.out.println("power of two");
        else    
            System.out.println("not a power of two");    
    }
}