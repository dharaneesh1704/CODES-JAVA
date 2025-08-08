public class Fibanocci 
{
    public static void main(String[] args) 
    {
        int n=5;
        int dp[]=new int[n+1];
        if(n<=1)    
        {
            System.out.println(n);
        }
        else
        {
            dp[0]=0;    
            dp[1]=1;
            for(int i=2;i<=n;i++)
            {
                dp[i]=dp[i-1]+dp[i-2];
            }               
        }
        System.out.println(dp[n]); // Output the nth Fibonacci number
        System.out.println("Fibonacci number at position " + n + " is: " + dp[n]); // Print the result
    }  
        
}
