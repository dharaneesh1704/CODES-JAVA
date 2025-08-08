class sum_cubes
{
    public static void main(String args[])
    {
            int m=1,n=2;
            
            if(m>n && !(m==n))
            {
                System.out.println(0);
            }

            else
            {
                int i,count=0;

                for(i=m;i<n+1;i++)
                {
                    count+=(i*i*i);
                }

                System.out.println("the sum of cubes is : "+count);
            }
    }
}