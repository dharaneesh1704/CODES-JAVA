public class chocolate_splitting 
{
    public static void main(String[] args) 
    {
        int arr[]={2,2,1,3,2};
        int date=4;
        int month=2;

        int count=0;
        int sum=0;
        for(int i=0;i<month;i++)
        {
            sum+=arr[i];
        }
        if(sum==date)
            count++;

        for(int i=0;i<arr.length-month;i++)    
        {
            sum=(sum+arr[i+month]-arr[i]);
            if(sum==date)
                count++;
        }
        System.out.println(count);

    }    
}
