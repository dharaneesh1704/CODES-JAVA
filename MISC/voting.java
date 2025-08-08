import java.util.Scanner;
/*enna 
 *  solrathunu 
 *      theriyala
 *          broooooooooo....
 */
class voting
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);

        int age;
        String country;

        System.out.println("enter the age : ");
        age=scan.nextInt();

        System.out.println("enter the country in lower case(full form) : ");
        country=scan1.nextLine();

        //System.out.println(country);

        if((age>=18) && (country.equals("india")))
        {
            System.out.println("the candidate is eligible to vote");
        }

        else
        {
            System.out.println("the candidate is not eligible to vote");
        }
    }
}