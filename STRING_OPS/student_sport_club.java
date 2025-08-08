import java.util.Scanner;
class student_sport_club
{
    public static void main(String args[])
    {
        boolean good_academic,having_sport_certificate;
        int no_of_sports_participated;

        Scanner sc1= new Scanner(System.in);
        Scanner sc2= new Scanner(System.in);
        Scanner sc3= new Scanner(System.in);

        System.out.println("did the student having good academic record : (true/false)");
        good_academic=sc1.nextBoolean();

        System.out.println("did the student having any sport certificate : (true/false)");
        having_sport_certificate=sc2.nextBoolean();

        System.out.println("enter the number of sports that he participated : ");   
        no_of_sports_participated=sc3.nextInt();

        if(good_academic || having_sport_certificate || (no_of_sports_participated>=1))
        {
            System.out.println("the student is eligible to join the club");
        }

        else
        {
            System.out.println("the student is not eligible to join the club");
        }


    

    }
}