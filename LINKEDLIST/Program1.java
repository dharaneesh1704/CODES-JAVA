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
     static void create(int data)
    {
        Node newNode=new Node(data);
        
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

    static void insertMiddle(int pos,int data)
    {
        Node newNode=new Node(data);
        Node temp=head;
        int count=0;
        while(temp!=null)
        {
            count++;
            if(count==pos-1)
            {
                newNode.next=temp.next;
                temp.next=newNode;
                break;
            }
            temp=temp.next;
        }
    }
}

class Program1
{
    public static void main(String[] args) 
    {
        SingleLinkedList.create(10);
        SingleLinkedList.create(100);
        SingleLinkedList.create(12234);
        SingleLinkedList.create(111111);
        System.out.println("before insert");
        SingleLinkedList.display();
        SingleLinkedList.insertMiddle(3, 666);
        System.out.println("After insert");
        SingleLinkedList.display();


    }
}