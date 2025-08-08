import java.util.Scanner;
class Simple_calculator
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("CHOOSE YOUR OPTION: ");
        System.out.println("1. Addition\n2.subraction\n3.multiplication\n4.division");
        int symbol=sc.nextInt();

        System.out.println("Enter the first number: ");
        float a = sc.nextFloat();

        System.out.println("Enter the second number: ");
        float b = sc.nextFloat();

        switch (symbol) {
            case 1:
                System.out.println("Addition : "+(a+b));               
                break;
            case 2:
                System.out.println("Subraction : "+(a-b));               
                break;
            case 3:
                System.out.println("Multiplication : "+(a*b));               
                break;
            case 4:
                System.out.println("Division : "+(a/b));       
                break;
                
            default:
                System.out.println("Invalid input");
                
        }

        

    }
}