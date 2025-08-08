import java.util.*;

class remove_duplicate
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        LinkedHashSet<Integer> ar1=new LinkedHashSet<Integer>();

        int arr[]={1,2,3,3,4,4,4,5};

        for(int i=0;i<arr.length;i++)
        {
            ar1.add(arr[i]);
        }

        int[] arr2=new int[ar1.size()];

        
        int i=0;
        for(int j:ar1)
        {
            arr2[i]=j;
            System.out.println(arr2[i]);
            i++;
        }
            
        
    }
}