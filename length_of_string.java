import java.util.Scanner;
//21/01/25
class length_of_string
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s=sc.next();
        int count = 0;
        char[] a = s.toCharArray();
        for(char i:a){
            count++;
        }
        System.out.println("The length of the String is:"+count);
        

      
    }
}