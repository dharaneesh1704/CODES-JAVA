import java.util.*;
class leetcode_3151
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int nums[]=new int[len];
        
        for(int i=0;i<len;i++)
        {
            nums[i]=sc.nextInt();
        }
        if(len==1)
        {
            System.out.print("false");
        }
        else
        {
            int j=0;
            int count=0;
            for(int i=0;i<len;i++)
            {
                if(j+1<len)
                    j=i+1;
                else
                    break;    
            if((nums[i]%2==0 && nums[j]%2!=0) || (nums[i]%2!=0 && nums[j]%2==0))
                {
                    count++;
                }
                
            }
            if(count==(nums.length-1))
            {
                System.out.print("true");
            }
            else
            {
                System.out.println("false");;
            }
        }
    }
}