
import java.util.Scanner;
class palindrome
{
    public static void main(String args[])
    {
        System.out.println("enter the string : ");
        Scanner sc=new Scanner(System.in);
        String s=sc.next();

        int count=0;
        char[] cc=new char[s.length()];
        cc=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if(cc[i]==cc[cc.length-i-1])
            {
                count++;
            }
        }

        if(count==(s.length()))
        {
            System.out.println("it is palindrome");
           // System.out.println(count);
        }
        else
        {
            System.out.println("not a plindrome");
           // System.out.println(count);
        }
    }


}