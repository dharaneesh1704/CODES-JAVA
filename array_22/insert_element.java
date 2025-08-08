
import java.util.Scanner;


class insert_element
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        System.err.println("enter the length: ");
        int len=sc.nextInt();

        int[] arr=new int[len];
        for(int i=0;i<len;i++)
        {
            System.out.println("enter the array element: ");
            arr[i]=sc.nextInt();
        }

        System.out.println("enter the index to insert: ");
        int ind=sc.nextInt();

        System.out.println("enter the number: ");
        int num=sc.nextInt();

        int j=0;
        int[] new_arr =new int[len+1];
        for(int i=0;i<len;i++)
        {

            if(i==ind)
            {
                new_arr[j]=num;
                j+=1;
            }
            new_arr[j]=arr[i];
            j+=1;


        }

        for(int i:new_arr)
        {
            System.out.print(i+"  ");
        }
    }
}