import java.util.Scanner;
class String_reverse
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s=sc.next();

         char[] cc=new char[s.length()];
         cc=s.toCharArray();
        for(int i=s.length()-1;i>=0;i--)
        {
            System.out.print(cc[i]);
        }
    }
}