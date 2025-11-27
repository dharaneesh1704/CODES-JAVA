class B
{
	public static void main(String args[])
    {
    	// Scanner sc=new Scanner(System.in);
        // int r=sc.nextInt();
        // int c=sc.nextInt();
        // sc.nextLine(); 
        // char arr[][]=new char[r][c];
        int r = 5, c = 5;

        char[][] arr = {
            {'.', '.', '#', '.', '.'},
            {'.', '.', '#', '.', '#'},
            {'.', '#', '#', '#', '.'},
            {'.', '.', '.', '.', '.'},
            {'#', '#', '.', '.', '.'}
        };

        String s = "SSSSRSS";
        
        // for(int i=0;i<r;i++)
        // {
        // 	//String line = sc.nextLine();
        // 	for(int j=0;j<c;j++)
        //     {
        //     	arr[i][j]=line.charAt(j);
        //         //System.out.println(arr[i][j]);
        //     }
        // }
        // String s=sc.next();
        int count=0;
        int[] x = {-1, 0, 1, 0};
        int[] y = {0, 1, 0, -1};
       
        for(int i=0;i<r;i++)
        {
        	for(int j=0;j<c;j++)
            {
            	int tempx=i;
                int tempy=j;
                int ind=0;
                boolean flag=true;
            	for(int k=0;k<s.length();k++)
                {
					char cc=s.charAt(k);
                    if(cc=='L')
                    	ind=(ind+4-1)%4;
                    if(cc=='R')
                    	ind=(ind+1)%4;
                    if(cc=='S')
                    {
                    	tempx+=x[ind];
                        tempy+=y[ind];
                    }
                    if(tempx<0 || tempx>=r || tempy<0 || tempy>=c || arr[tempx][tempy]=='#')
                   	{
                    	flag=false;
                        System.out.println("dfghjk");
                        break;
                    }
                    	
                }
                if(flag)
                	count++;
            }
        }
        System.out.println(count);
        
    }
}