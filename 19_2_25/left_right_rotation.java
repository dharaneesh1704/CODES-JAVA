import java.util.*;
class left_right_rotation
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.err.println("enter the number: ");
        int num=sc.nextInt();

        System.out.println("enter the number of rotation : ");
        int rot=sc.nextInt();

        int len=0;
        int pow=1;
        int copy=num;
        while(num!=0)
        {
            num=num/10;
            pow=pow*10;
            len++;
        }
        pow=pow/10;
        num=copy;

        rot=rot%len;
        if(rot<0)
            rot=rot+len;


        for(int i=0;i<rot;i++)    
        {
            int rem=num%10;
            int qu=num/10;
            num=(rem*pow)+qu;
            System.out.println(num);
        }
        if(rot==0)
        {
            System.err.println(num);
        }

    }
}