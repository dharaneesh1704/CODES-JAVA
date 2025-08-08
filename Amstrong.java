import java.util.Scanner;
public class Amstrong 
{
    public static void main(String[] args) 
    {
        Scanner sc=new  Scanner(System.in);
        System.out.println("Enter the number : ");
        int  n=sc.nextInt();
        String s=""+n;
        //int [] arr=new int(s.length());
        double n1=n,x=0,count=0;
        while(n!=0)
        {
            x=n%10;
            count=Math.pow(x, s.length())+count;
            n=n/10;
           
        }
        if(count==n1)
        {
            System.out.println("it is amstrong");
        }
        else
        {
            System.out.println("it is not armstrong");
        }
        
       


        

    }    

}
