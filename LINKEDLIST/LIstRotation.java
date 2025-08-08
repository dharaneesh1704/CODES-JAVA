

class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}

class SingleLinkedList
{
    static Node head,tail;
    static int len=0;
    static void create(int data)
    {
        Node newNode=new Node(data);
        len++;
        if(head==null)
        {
            head=newNode;
            tail=newNode;
        }
        else
        {
            tail.next=newNode;
            tail=newNode;
        }
    }

    static void display()
    {
        Node temp=head;
        
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    static void rotation(int num)
    {
        
        int count=0;
        int rot=num%len;
    
        
        tail.next=head;
        Node temp=tail;
        for(int i=0;i<len-rot;i++)
        {
            temp=temp.next;
        }
        head=temp.next;
        temp.next=null;
        tail=temp;
    
    }
    
}

public class LIstRotation {
    
    public static void main(String[] args) 
    {
        SingleLinkedList.create(10);    
        SingleLinkedList.create(20);    
        SingleLinkedList.create(30);    
        SingleLinkedList.create(40);    
        SingleLinkedList.create(50);    
        SingleLinkedList.create(60);    
        SingleLinkedList.create(70);    

        SingleLinkedList.rotation(4);
        SingleLinkedList.display();
    }
}
