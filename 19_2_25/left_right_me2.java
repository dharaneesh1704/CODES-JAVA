import java.util.*;
class left_right_me2
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

        int div=1;
        for(int i=0;i<rot;i++)    
        {
            div=div*10;
        }
        int rem=num%div;
        int quo=num/div;

        int mul=1;
        for(int i=0;i<(len-rot);i++)
        {
            mul=mul*10;
        }
        int res=(mul*rem)+quo;
        System.out.println(res);

    }
}