
import java.util.Scanner;

class railway_ticket{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total=0;
        int age=0;

        System.out.println("Enter the age : ");
        age=sc.nextInt();

    

        while(age!=0)
        {

            if(age<12)
            {
                total+=20;
            }
            else if(age>60)
                total+=30;
            else
                total+=50;    

            System.out.println("Enter the age : ");
            age=sc.nextInt();    

        }

    if(total>300)    
        total=total*.95;


    System.out.println("total ticket price is : "+total);    
    }
}