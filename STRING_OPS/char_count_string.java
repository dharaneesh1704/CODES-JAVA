import java.util.Scanner;
//21/1/25
class char_count_string
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the String: ");
        String s=sc.next();

        System.out.print("Enter the character: ");
        char cc=sc.next().charAt(0);


        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c==cc)
            {
                count++;
            }
        }
        System.out.println("the occurence is : "+count);
    }
}