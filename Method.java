class Test{
    int a = 10;
    Test(){
        System.out.print(a);
    }
}
public class Method{
    public static void main(String[] args) {
        Test a = new Test();
    }    
}