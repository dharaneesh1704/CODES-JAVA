


class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}

class DoublyLinkedList
{
    static Node head,tail;
    static void create(int data)
    {
        Node newNode =new Node(data);

        if(head==null)
        {
            head=newNode;
            tail=newNode;
        }
        else
        {
            newNode.prev=tail;
            tail.next=newNode;
            tail=newNode;
        }
    }

    static void displayForward()
    {
        Node temp=head;
        System.out.println("forward print");
        while(temp!=null)
        {
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    static void displayBack()
    {
        Node temp=tail;
        System.out.println("reverse print");
        while(temp!=null)
        {
            System.out.print(temp.data+" -> ");
            temp=temp.prev;
        }
        System.out.println("null");
    }

    static void insertAtPos(int pos,int data)
    {
        Node newNode=new Node(data);
        Node temp=head;
        int count=0;
        while(temp!=null)
        {
            count++;
            if(count==pos-1)
            {
                newNode.prev=temp;
                newNode.next=temp.next;
                temp.next=newNode;
                newNode.next.prev=newNode;
                break;
            }
            temp=temp.next;
        }
        if(temp==null)
            System.out.println("Invalid postion");
        DoublyLinkedList.displayForward();
        DoublyLinkedList.displayBack();
    }

    static void insertAtBegin(int data)
    {
        Node newNode=new Node(data);
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }

    static void insertAtLast(int data)
    {
        Node newNode=new Node(data);
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }

    static void deleteByPos(int pos)
    {
        Node temp=head;
        int count=0;
        while(temp!=null)
        {
            count++;
            if(count==pos-1)
            {
                temp.next=temp.next.next;
                temp.next.prev=temp;
                break;
            }
            temp=temp.next;
        }
        if(temp==null)
            System.out.println("Invalid position");
    }

    static void deleteAtBegin()
    {
        head=head.next;
        head.prev=null;
    }

    static void deleteAtEnd()
    {
        tail=tail.prev;
        tail.next=null;
    }

    static void rev()
    {
        Node temp=head;
        tail = head;
        Node x=new Node(0);
        while(temp!=null)
        {   head = temp;
            x=temp.prev;
            temp.prev=temp.next;
            temp.next=x;
            temp=temp.prev;
        }
    }
}

public class DoubleLinkedList 
{
    public static void main(String[] args) 
    {
        DoublyLinkedList.create(20);
        DoublyLinkedList.create(21);
        DoublyLinkedList.create(22);
        DoublyLinkedList.create(23);
        DoublyLinkedList.create(24);
        
        //DoublyLinkedList.displayBack();
        //DoublyLinkedList.displayForward();

        System.out.println("after inserting 11 a pos 3, 12 at pos 4");
        DoublyLinkedList.insertAtPos(3, 11);
        DoublyLinkedList.insertAtPos(4, 12);

        DoublyLinkedList.insertAtBegin(000);
        DoublyLinkedList.insertAtBegin(111);
        DoublyLinkedList.insertAtLast(111);
        DoublyLinkedList.displayForward();

        System.out.println("After deletion---------------");
        DoublyLinkedList.deleteByPos(3);
        DoublyLinkedList.displayForward();
        DoublyLinkedList.displayBack();

        System.out.println("before delete------------------");
        DoublyLinkedList.displayForward();

        System.out.println("After delete at begin and end-----------------------");
        DoublyLinkedList.deleteAtBegin();
        DoublyLinkedList.deleteAtEnd();
        DoublyLinkedList.displayForward();
        DoublyLinkedList.displayBack();

        System.out.println("After rotation-----------");
        DoublyLinkedList.rev();
        DoublyLinkedList.displayForward();
        DoublyLinkedList.displayBack();

    }
    
}