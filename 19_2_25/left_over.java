/*
 * input is array
 * find the min and the max
 * the remove the min and max from the array
 * then update the array
 * do this until only one element is left
 */

 import java.util.*;
 class left_over
 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter th length: ");
        int len=sc.nextInt();

        int arr[]=new int[len];
        System.err.println("enter the array: ");
        for(int i=0;i<len;i++)
        {
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);
        if(len%2==0)
            len-=1;
        System.out.print("left over element: "+arr[len/2]);
    }
 }