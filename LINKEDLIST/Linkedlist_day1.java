//SINGLY LINKEDLIST ---------------------day1   day2
// link at onlinegdb: abL4RQLC
// {
//     int val1;
//     int val2;
// }

// public class Linkedlist_day1 
// {
//     public static void main(String[] args) 
//     {
//         classvariable obj=new classvariable();
//         obj.val1=10;
//         obj.val2=100;
//         System.out.println(obj.val1);
//         System.out.println(obj.val2);
//     }    
// }
//SINGLY LINKEDLIST --------------day1      day2
// link at onlinegdb: abL4RQLC
class Node
{
    int data;
    Node next;

    Node(int data)
    {
        //constructor
        this.data=data;
        this.next=null;
    }
}

class SingleLL
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

    void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }

    }

    void min()
    {
        int mini=Integer.MAX_VALUE;
        Node temp=head;
        while(temp!=null)
        {
            mini=Math.min(mini,temp.data);
            temp=temp.next;
        }
        System.out.println("smallest num:"+mini);
    }

    void max()
    {
        int maxi=Integer.MIN_VALUE;
        Node temp=head;
        while(temp!=null)
        {
            maxi=Math.max(maxi,temp.data);
            temp=temp.next;
        }
        System.out.println("biggest num:"+maxi);
    }

    void sum()
    {
        int tot=0;
        Node temp=head;
        while (temp!=null) 
        {
            tot+=temp.data;
            temp=temp.next;    
        }
        System.out.println("the total sum of the data is: "+tot);
    }

    void insertBegin(int data)
    {
        Node node=new Node(data);
        node.next=head;
        head=node;
    }

    void insertMiddle(int pos,int num)
    {
        Node middle=new Node(num);
        Node front=head;
        Node back=head.next;
        int count=0;
        while(back!=null)
        {
            count++;
            if(count==pos-1)
            {
                front.next=middle;
                middle.next=back;
                break;
            }
            front=front.next;
            back=back.next;
        }      

    }

    void deleteByPosition(int pos)
    {
        Node temp=head;
        Node x=null;
        int count=0;
        while(temp!=null)
        {
            count++;
            if(count==pos-1)
            {
                x=temp;
                x=x.next;
                x=x.next;
                temp.next=x;
                
            }
            temp=temp.next;
        }
    }

    void deleteByBegin()
    {
        head=head.next;
    }

    void deleteByNumber(int num)
    {
        //COMMENTED ONE IS THE CORRECT LOGIC
        /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/*class Solution {
    public ListNode removeElements(ListNode head, int val) {
        
        
        ListNode temp=head;
        while(temp!=null)
        {
            if(head!=null && head.val==val)
                head=head.next;
            else if(temp.next!=null && temp.next.val==val)    
                temp.next=temp.next.next;
            else
                temp=temp.next;    
        }
        return head;
    }
}*/
        if(num==head.data)
        {
            head=head.next;
            return;
        }

        Node front=head;
        Node mid=front.next;
        Node last=mid.next;
        while(mid!=null)
        {
            if(mid.data==num)
            {
                front.next=last;
                break;
            }
            front=front.next;
            mid=mid.next;
            last=last.next;
            if(last.next==null && last.data==num)
            {
                mid.next=null;
                break;
            }
        }
    }



}

class Linkedlist_day1
{
    public static void main(String[] args) 
    {
        SingleLL list=new SingleLL();
        System.out.println("after the insertion");
        list.create(10);
        list.create(10056);
        list.create(10006);
        list.create(00);
        list.create(777);
        list.display();

        

        System.out.println("Displaying the min max and sum");
        list.sum();
        list.max();
        list.min();

        System.out.println("Insert at begin");
        list.insertBegin(111);
        list.display(); 

        System.out.println("insert at the middle/pos");
        list.insertMiddle(2, 786);
        list.display();

        System.out.println("After deleting at the position 2");
        list.deleteByPosition(2);
        list.display();

        System.out.println("after deleting at begin");
        list.deleteByBegin();
        list.display();

        System.out.println("Delete by number : 0");
        list.deleteByNumber(10);//we can delete the number at any position
        list.display();



    }
}