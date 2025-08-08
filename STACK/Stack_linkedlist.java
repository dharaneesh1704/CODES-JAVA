class Node
{
    int data;
    Node next;
    
    public Node(int data) 
    {
        this.data=data;
    }
}

class Stack
{
    static Node head,tail;
    void push(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
        }
        else
        {
            newNode.next=head;
            head=newNode;
        }
    }

    boolean isEmpty()
    {
        if(head==null)
            return true;
        return false;    
    }

    void top()
    {
        System.out.println(head.data);
    }

    void pop()
    {
        if(!isEmpty())
        {
            head=head.next;
        }
        else
            System.out.println("stack is empty");
    }

    void display()
    {
        System.out.println("elements in stack");
        Node temp=head;
        while(!isEmpty())
        {
            System.out.println(head.data);
            head=head.next;
        }
        head=temp;

    }


}
public class Stack_linkedlist {
    public static void main(String[] args) 
    {
        Stack stack=new Stack();    
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.pop();

        stack.top();

        stack.display();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

       
    }
}
