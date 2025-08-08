import java.util.*;
class string_reverse
{
    public static String reverse(String s,String res,int len)
    {
        if(len==0)
            return res;
        res=res+s.charAt(len-1);
        return reverse(s,res,len-1);

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string: ");
        String s=sc.nextLine();
        System.out.println(reverse(s,"",s.length()));
    }
} ;