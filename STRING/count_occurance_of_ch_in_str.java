
import java.util.Scanner;

class count_occurance_of_ch_in_str
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in)    ;
        System.out.print("Enter the string : ");
        String s=sc.next();

        System.out.println("enter the character to find the occurance : ");
        char find=sc.next().charAt(0);

        char[] cc=s.toCharArray();
        int count=0;
        for(char c:cc)
        {
            if(c==find)
            count++;
        }
        System.out.println("the number of occurence is "+count);
    }
}