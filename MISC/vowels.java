import java.util.Scanner;
//21/01/25
class vowels
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s=sc.next();

        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
            {
                count++;
            }
        }
        System.out.println("the occurence is : "+count);
    }
}