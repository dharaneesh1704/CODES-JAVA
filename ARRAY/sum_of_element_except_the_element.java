import java.util.Scanner;

class sum_of_element_except_the_element
{
    public static void main(String[] args) 
    {
        
    
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the length: ");
    int len=sc.nextInt();
    int[] arr=new int[len];
    for(int i=0;i<len;i++)
    {
        System.out.println("enter the element: ");
        arr[i]=sc.nextInt();
    }

    int sum=0;
    for(int i:arr)
        sum+=i;
    int index=0;    
    for(int i=0;i<len;i++)    
    {
        arr[i]=sum-arr[i];
        System.out.print(arr[i]+" ");
    }

    }
}