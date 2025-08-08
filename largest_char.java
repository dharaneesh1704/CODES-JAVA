import java.util.Scanner;

class largest_char
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s=sc.next();

        char[] c=s.toCharArray();

        int max=(int)c[0];
        for(int i=0;i<s.length()-1;i++)
        {
            if(max< (int)c[i+1])
                max=(int)c[i+1];
        }
        System.out.println((char)max);
    }
}