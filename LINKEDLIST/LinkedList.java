

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

    static void midElement()
    {
        Node fast=head,slow=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println("the mid element is : "+slow.data);
    }

    static void circularCheck()
    {
        boolean loop=false;
        Node slow=head,fast=head;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;

            if(fast==slow)
            {
                System.out.println("Loop detected");
                loop=true;
                break;
            }
            
        }
        if(!loop)
            System.out.println("No loop detected");
    }

    static void reverse()
    {
        Node temp=head,next=temp.next;
        Node prev=null;
        while(temp!=null)
        {
            temp.next=prev;
            prev=temp;
            temp=next;
            if(next !=null)
                next=next.next;


                // next=temp.next;
                // temp.next=prev;
                // prev=temp;
                // temp=next;              
                

        }
        head=prev;
    }

    static void sort()
    {
        Node temp=head;
        Node min;
        while(temp!=null)
        {
            min=temp.next;
            while(min!=null)
            {
                if(min.data<temp.data)
                {
                    int x=min.data;
                    min.data=temp.data;
                    temp.data=x;
                }
                min=min.next;
            }
            temp=temp.next;
        }
    }

    static void removeDuplicateInsortedList()
    {
       Node prev=head;
       Node temp=head.next;
       while(temp!=null)
       {
        if(prev.data!=temp.data)
        {
            prev.next=temp;
            prev=temp;
            temp=temp.next;
        }
        else
        {
            temp=temp.next;
        }
       }
       prev.next=null;
       //why i need to give prev.next as null
       // the reason is to remove the old referece values
    }

}

public class LinkedList {
    
    public static void main(String[] args) 
    {
            SingleLinkedList.create(10);
            SingleLinkedList.create(11);
            SingleLinkedList.create(12);
            SingleLinkedList.create(12);
            //SingleLinkedList.create(10);
            //SingleLinkedList.create(10);
            //SingleLinkedList.create(13);
            SingleLinkedList.create(14);

            SingleLinkedList.display();
            SingleLinkedList.midElement();
            SingleLinkedList.circularCheck();
            
            System.out.println("before rotate");
            SingleLinkedList.display();

            System.out.println("after rotate");
            SingleLinkedList.reverse();
            SingleLinkedList.display();

            

            System.out.println("after sort");
            SingleLinkedList.sort();
            SingleLinkedList.display();

            System.out.println("After remove duplicate");
            SingleLinkedList.removeDuplicateInsortedList();
            SingleLinkedList.display();
            
    }
}
