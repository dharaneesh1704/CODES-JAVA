
import java.util.Scanner;

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

    static void insertBegin(int data)
    {
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }

    static void insertPos(int pos,int data)
    {
        Node newNode=new Node(data);
        int count=0;
        Node temp=head;
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

    static void deleteBegin()
    {
        head=head.next;
    }

    static void deleteEnd()
    {
        Node temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
    }

    static void deletePos(int pos)
    {
        Node temp=head;
        int count=0;
        while(temp!=null)
        {
            count++;
            if(count==pos-1)
            {
                temp.next=temp.next.next;
                break;
            }
            temp=temp.next;
        }
    }
}

public class SingleLinkedListDay4Test
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element to insert");
        System.out.println("enter -11 to terminate");
        System.out.println("");
        while(true)
        {
            
             int n=sc.nextInt();
             if(n==-11)
                 break;
            SingleLinkedList.create(n);
        }

        System.out.println("after creation");
        SingleLinkedList.display();

         System.out.println("enter the element to insert at begin");
        while(true)
        {
            int n=sc.nextInt();
            if(n==-11)
                break;
            SingleLinkedList.insertBegin(n);    
        }
        System.out.println("after insert at begin");

        SingleLinkedList.display();

        System.out.println("enter the number to insert at last");
        while (true) 
        {
            int n=sc.nextInt();
            if(n==-11)
                break;
            SingleLinkedList.create(n);                
        }
        System.out.println("after isertion at last");
        SingleLinkedList.display();

        System.out.println("enter the number to insert at last as pos and num");
        while(true)
        {
            int pos=sc.nextInt();
            int num=sc.nextInt();
            if(pos==-11)
            {
                break;                
            }
         SingleLinkedList.insertPos(pos, num);

        }

        System.out.println("after insertion at middle");
        SingleLinkedList.display();

        System.out.println("deleting the 1st node and last node inlikedlist");
        SingleLinkedList.deleteBegin();
        SingleLinkedList.deleteEnd();
        SingleLinkedList.display();

        System.out.println("enter the pos to delete");
        while(true)
        {
            int pos=sc.nextInt();
            if(pos==-11)
            {
                break;
            }
            SingleLinkedList.deletePos(pos);
        }
        System.out.println("after deletion");
        SingleLinkedList.display();
        



    
    }    

}
