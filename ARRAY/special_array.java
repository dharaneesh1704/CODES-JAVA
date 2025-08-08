import java.util.*;
class special_array
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the length: ");    
        int len=sc.nextInt();

        System.out.println("Enter the array: ");
        int arr[]=new int[len];

        for(int i=0;i<len;i++)
        {
            arr[i]=sc.nextInt();
        }

        int count=0;
        for(int i=0;i<len-1;i++)
        {
            if((arr[i]%2==0 && arr[i+1]%2!=0) || (arr[i]%2!=0 && arr[i+1]%2==0))
            {
                count++;
            }
        }

        if(count==(len-1))
            System.out.println("special array");
        else    
            System.out.println("not a special array");    

    }
    
}