import java.util.*;
class binary_value
{
    public static  void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        int num=sc.nextInt();

        System.out.println("enter the index: ");
        int k=sc.nextInt();
        int i=1;
        boolean flag=false;
        while (num!=0)
        { 
            if((num & 1)==1)    
            {
                if(i==k)
                    flag=true;
            }
            num=num>>1;
            i++;
        }

        if(flag)
            System.out.println("yes");
        else
            System.out.println("no");    
    }
}