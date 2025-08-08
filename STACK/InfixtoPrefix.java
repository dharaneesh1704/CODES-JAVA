class Node
{
    String data;
    Node next;
    Node(String data) 
    {
        this.data=data;
        this.next=null;
    }
    
}

class Value
{
    static Node head,tail;
    static void push(String s)
    {
        Node newNode=new Node(s);
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
    static boolean isEmpty()
    {
        if(head==null)
            return true;
        return false;
    }

    static String pop()
    {
        String temp=head.data;
        head=head.next;
        return temp;
    }

    static String peek()
    {
        if(!isEmpty())
            return head.data;
        return "";
    }
}

class Operation
{
    static Node head,tail;
    static void push(String s)
    {
        Node newNode=new Node(s);
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
    static boolean isEmpty()
    {
        if(head==null)
            return true;
        return false;
    }

    static String pop()
    {
        String temp=head.data;
        head=head.next;
        return temp;
    }

    static String peek()
    {
        if(!isEmpty())
            return head.data;
        return "";
    }
}


class InfixtoPrefix
{
    public static void main(String[] args) 
    {
        String s="(a+b+c+(d*e))";
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if((c>='a' && c<='z')||(c>='A' && c<='Z'))
            {
                Value.push(""+c);
            }
            else if(c=='(')
            {
                Operation.push(""+c);
            }
            else if(c==')')
            {
                while(!Operation.isEmpty() && !Operation.peek().equals("("))
                {
                    String op = Operation.pop();
                    String v2 = Value.pop();
                    String v1 = Value.pop();
                    String res = op + v1 + v2;
                    Value.push(res);
                }
                Operation.pop(); // Pop the '('
            }
            else if(c=='+' || c=='-' || c=='*' || c=='/')
            {
                while(!Operation.isEmpty() && !Operation.peek().equals("(") && precedence(""+c)<=precedence(Operation.peek()))
                {
                    String op = Operation.pop();
                    String v2 = Value.pop();
                    String v1 = Value.pop();
                    String res = op + v1 + v2;
                    Value.push(res);
                }
                Operation.push(""+c);
            }
            else
            {
                Operation.push(""+c);
            }
        }
        while(!Operation.isEmpty())
        {
            String res=Operation.pop();
            String v2=Value.pop();
            String v1=Value.pop();
            res+=v1+v2;
            Value.push(res);
        }
        System.out.println(Value.peek());
    }

    public static int precedence(String data)
    {
        char c=data.charAt(0);
        if(c=='+' || c=='-')
            return 1;
        if(c=='*' || c=='/')
            return 2;
        return 0;
    }
}