import java.util.Scanner;
class hotel_room_booking
{
    public static void main(String args[])
    {
        int age;
        boolean vip_guest,booking_confirmation;
        boolean unpaid_bills;

        Scanner s1=new Scanner(System.in);
        Scanner s2=new Scanner(System.in);
        Scanner s3=new Scanner(System.in);
        Scanner s4=new Scanner(System.in);

        System.out.println("enter the age \n enter the status of vip_guest(true/false) \n enter the booking confirmation status(true/false)\n does the client want to pay any bending amount");
        
        age=s1.nextInt();
        vip_guest=s2.nextBoolean();
        booking_confirmation=s3.nextBoolean();
        unpaid_bills=s4.nextBoolean();

        if(age>=18 && (vip_guest || booking_confirmation) && !(unpaid_bills))
        {
            System.out.println("the guest is eligible for offer");
        }

        else
        {
            System.out.println("the guest is not eligible for offer");
        }


    }
}