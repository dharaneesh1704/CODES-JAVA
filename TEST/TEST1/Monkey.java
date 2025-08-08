
import java.util.Scanner;

public class Monkey 
{
    public static void main(String[] args) 
    {
        try
        {
            Scanner sc=new Scanner(System.in);            
        int monkey=sc.nextInt();
        int monkey_peanut=sc.nextInt();
        int monkey_banana=sc.nextInt();
        int peanut=sc.nextInt();
        int banana=sc.nextInt();

        int count=0;
        while(peanut>=monkey_peanut || banana>=monkey_banana)
        {
            if(peanut>=monkey_peanut)
            {
                peanut-=monkey_peanut;
            }
            else if(banana>=monkey_banana)
            {
                banana-=monkey_banana;
            }
            else
            {
                count++;
                break;
            }

            count++;
        }
        System.out.println("monkeys keft over:"+(monkey-count));
        }
        catch(Exception e)
        {
            System.out.println("enter valid input");
        }
    }    
    
}
