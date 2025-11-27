class A
{
    int x=10;
}
class B extends A
{

}
class C extends B
{

}
abstract class x
{
    void hai()
    {
        System.out.println("hai()");
    }

    abstract int method_x_2();
    abstract int method_x();
}

class aa extends x
{
    int method_x()
    {
        System.out.println("abstract method is running");
        return 0;
    }

    int method_x_2()
    {
        System.out.println("abstract method 2 is running");
        return 0;
    }
}



public class Ajith 
{
    public static void main(String[] args) 
    {
        A obj=new C();
        System.out.println(obj.x);

        x obj_X=new aa();
        System.out.println(obj_X.method_x());

        obj_X=new aa();
        System.out.println(obj_X.method_x_2());
    }   
}
