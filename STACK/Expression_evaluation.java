//postfix evaluvation
class Node
{
    char data;
    Node next;
    Node(char data)
    {
        this.data=data;
        next=null;
    }
}

class Stack
{
    static Node head,tail;
    static void push(char c)
    {
        if(c>='0' && c<='9')
        {
            Node newNode=new Node(c);
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
        else
        {
            int p2=head.data-'0';
            head=head.next;
            int p1=head.data-'0';
            switch(c)
            {
                case '+':
                    head.data=(char)(p1+p2+(int)'0');
                    break;
                case '-':
                    head.data=(char)(p1-p2+(int)'0');
                    break;
                case '*':
                    head.data=(char)(p1*p2+(int)'0');
                    break;
                case '/':
                    head.data=(char)(p1/p2+(int)'0');
                    break;
                case '%':
                    head.data=(char)(p1%p2+(int)'0');
                    break;
            }
        }
    }
   
    static int res()
    {
        return (int)head.data;
    }
   
   
}

class Expression_evaluation
{
    public static void main(String args[])
    {
        //123*+4-
        String s="123*+4-";
        for(int i=0;i<s.length();i++)
        {
            Stack.push(s.charAt(i));
        }
        System.out.println(Math.abs(Stack.res()-'0'));
       
    }
}