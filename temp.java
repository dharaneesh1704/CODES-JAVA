class temp
{
  public static void main(String args[])
  {
      System.out.println("vsf");
    //Scanner sc=new Scanner(System.in);
   // int len=sc.nextInt();
    //int ind=sc.nextInt();
    //ind-=1;
    int[] arr = {3, 3, 2, 1, 2, 4, 5, 5};

    int len=arr.length;
    // for(int i=0;i<len;i++)
    // {
    //   arr[i]=sc.nextInt();
      
    // }
    for(int i=0;i<len;i++)
    {
      int temp=0;
      for(int j=0;j<len;j++)
      {
          if(arr[i]<arr[j])
          {
              temp=arr[i];
              arr[i]=arr[j];
              arr[j]=temp;
              
          }
          
      }
    }
    System.out.println("fj");
    for(int i:arr){
    System.out.println(i);}
  }
}