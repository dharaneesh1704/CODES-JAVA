import java.util.Scanner;
class two_pointer 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the length: ");
        int len=sc.nextInt();
        System.out.println("Enter the element");
        int[] arr=new int[len];
        for(int i=0;i<len;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        int st=0,lt=0;
        for(int i=0;i<len/2;i++)
        {
            int temp=0;
            
                temp=arr[i];
                arr[i]=arr[arr.length-1-i];
                arr[arr.length-1-i]=temp;

            


            
        }
        for(int x:arr)
        {
            System.out.print(x+" ");
        }    
    }

}