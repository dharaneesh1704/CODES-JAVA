import java.util.Scanner;
class booking_railway_ticket
{
    public static void main(String args[])
    {
        System.out.println("1 for general ticket\n2 for senior citizen\n3 for children below 12  years\n0 to exit");

        int count=0,sym,discount=0;
        Scanner sc1=new Scanner(System.in);
        sym=sc1.nextInt();

        while(sym!=0)
        {  
        switch(sym)
        {
            case 1:
                count+=50;
                break;
            
            case 2:
                count+=30;
                break;
             
            case 3:
                count+=20;
                break; 
                
            default:
                System.out.println("enter the valid input");

        }
        sym=sc1.nextInt();  
        }   

        if(count>300)
        {
            discount=count*(5/100);
        }
        System.out.println("the total amount is : "+(count-discount));
    }
}