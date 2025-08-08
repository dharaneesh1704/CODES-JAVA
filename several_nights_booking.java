import java.util.Scanner;

class several_nights_booking
{
    public static void main(String args[])
    {
        int no_of_nights;
        float tax_p,dis_p,dis_amt=0,tot_amt,night_cost,tax_amt;

        Scanner sc2 =new Scanner(System.in);
        Scanner sc1 =new Scanner(System.in);
        Scanner sc3 =new Scanner(System.in);
        Scanner sc4 =new Scanner(System.in);

        System.out.println("enter the no of nights stayed : ");
        no_of_nights=sc1.nextInt();

        System.out.println("enter the per night cost and tax percentage : ");
        night_cost=sc1.nextFloat();
        tax_p=sc3.nextFloat();

        tot_amt=no_of_nights*night_cost;
        if(no_of_nights>5)
        {
            System.out.println("enter the discount percentage : ");
            dis_p=sc4.nextFloat();
            dis_p=tot_amt*(dis_p/100);
        }

        tax_amt=tot_amt*(tax_p/100);

        System.out.println("the total amount is to be paid by the guest is : "+(tot_amt+tax_amt-dis_amt));
    }
}