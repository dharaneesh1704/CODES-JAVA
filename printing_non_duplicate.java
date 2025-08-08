class printing_non_duplicate
{
    public static void main(String args[])
    {
        int[] arr1={1,2,3,4,4,5,2,6,6,5,99};

        int[] fin=new int[arr1.length];

        for(int i=0;i<arr1.length;i++)
        {
            int count=0;
            for(int j=0;j<arr1.length;j++)
            {
                if(arr1[i]==arr1[j])
                {
                    count++;
                }
            }
            if(count>1)
            {
                
            }
            else
            {
                fin[i]=arr1[i];
            }
        }
        for(int i : fin)
        {if(i!=0)
            System.out.println(i);
        }
    }
}