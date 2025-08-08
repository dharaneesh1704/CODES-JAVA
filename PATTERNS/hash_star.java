import java.util.Scanner;
//21/01/25
class hash_star
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s=sc.next();
        char[] a = new char[s.length()];

        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
            {
                a[i]='*';
            }
            else{
                a[i]='#';
            }
        }
        String temp = a.toString();
        System.out.println(temp);
      
        for(char j:a){
            System.out.print(j);
        }
    }
}