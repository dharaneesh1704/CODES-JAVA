class op_test
{
    public static void test(int n) {
        
        if(n==1)
            System.out.print(n+" ");
        else{    
        test(n-1);    
        System.out.print(n+" ");
        test(n-1);
        } 
    }
    public static void main(String[] args) {
        test(4);
    }
    
}