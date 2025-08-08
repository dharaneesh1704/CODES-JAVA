import java.util.*;
class sparse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();

        int sum=0;
        boolean flag=true;
        int count=0;
        while(num!=0)
        {
            int x=num%2;

            if(x==1){
                sum+=1;
                count++;
               // System.out.println(x);
                    }
            if(x==0){
                sum-=1;
                
            }    
            
            if((sum!=0) && (sum!=1) && (sum!=0))
            {
                flag=false;
               
            }
            //System.out.println(sum);
            num=num>>1;
        }
        if((count==1)||(flag &&(sum==1 || sum==0 || sum==-1)))
            System.out.println("sparse");
        else
            System.out.println("not sparse");    
    
    }
}