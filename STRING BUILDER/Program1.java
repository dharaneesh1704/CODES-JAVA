
import java.util.Scanner;

class Program1
{
    Program1(int n)
    {
        System.out.println("the length of the string is : "+n);
    }

    Program1(StringBuilder s) 
    {
        System.out.println("the string that you entered is : "+s);
    }    


    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string : ");
        String s=sc.next();
        /*
         * STRINGBUILDER                                                                                            STRINGBUFFER
         * SAFE                                                                                                     UN-SAFE
         * SYNCHRONIZED (DOES NOT MOVE TO THE ANOTHER PROCESS UNTIL THE INITIAL PROCESS COMPLETED)                  NO-THREAD
         * SLOWER                                                                                                   FASTER
         * INITIAL CAPACITY 16-BIT                                                                                  
         * 
         * BOTH OF THEM ARE HAVING THE SAME METHODS(FUNCTIONS).
         * BOTH OF THEM ARE USED TO MODIFY THE STRING
         */
        StringBuilder str=new StringBuilder();
        
        //APPEND
        str.append(s);
        Program1 obj=new Program1(str);
        
        char arr[]={'a','b','c'};
        str.append(arr);
        System.out.println(str);

        str.append(arr,0,1);
        System.out.println(str);

        //DELETE
        str.delete(0,5);
        System.out.println(str);

        //INDEXof
        System.out.println(str.indexOf("x"));
        System.out.println(str.indexOf("e"));

        //LastIndexOF
        System.out.println(str.lastIndexOf("x"));
        System.err.print(str.lastIndexOf("e"));

        //INSERT
        
    }
}
