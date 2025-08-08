//package OOPS;

class A
{
    public void display()
    {
        System.out.println("Display method of class A");
    }
}

class B extends A
{
    public void display()
    {
        
        System.out.println("Display method of class B");
    }
}

public class DynamicDispatch {
    public static void main(String[] args) 
    {
        A obj=new B();
        obj.display();    
    }
}
