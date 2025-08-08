
import java.util.Scanner;

public class pg1 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String res="";
        if(s.charAt(0)>='a' && s.charAt(0)<='z'){
            res+=(char)(s.charAt(0)-32);
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ' && s.charAt(i+1)!=' ' && s.charAt(i+1)>='a' && s.charAt(i+1)<='z'){
                res+=s.charAt(i);
                res+=(char)(s.charAt(i+1)-32);
            }
            else{
                res+=s.charAt(i);
            }
        }
        System.out.print(res);
    }    
}
