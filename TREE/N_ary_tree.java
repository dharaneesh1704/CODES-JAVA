import java.util.*;
class Node
{
    int data;
    ArrayList<Node> children;
    public Node(int data) 
    {
        this.data=data;
        this.children=new ArrayList<>();
    }
}

class N_ary_tree
{
    public static void main(String[] args) 
    {
        Node root=new Node(0);

        Node node1=new Node(1);
        Node node2=new Node(2);
        Node node3=new Node(3);
        Node node4=new Node(4);
        Node node5=new Node(5);
        Node node6=new Node(6);
        Node node7=new Node(7);
        Node node8=new Node(8);

        root.children.add(node1);
        root.children.add(node2);
        root.children.add(node3);
        root.children.add(node4);
        root.children.add(node8);

        node4.children.add(node5);
        node4.children.add(node6);
        node4.children.add(node7);

        System.out.print("InOrder: ");
        InOrder(root);
        System.out.println();

        System.out.print("preOrder: ");
        preOrder(root);
        System.out.println();

        System.out.print("postOrder: ");
        postOrder(root);
        System.out.println();
    }

    static void InOrder(Node node)
    {
        if(node==null)
            return;
        int size=node.children.size();
        for(int i=0;i<size-1;i++)
        {
            InOrder(node.children.get(i));
        }
        System.out.print(node.data+" ");
        if(size>0)
            InOrder(node.children.get(size-1));
    }

    static void preOrder(Node node)
    {
        if(node==null)
            return ;
        int size=node.children.size();
        System.out.print(node.data+" ");
        for(int i=0;i<size;i++)
        {
            preOrder(node.children.get(i));
        }
    }

    /*
        preorder using stack
     * Stack<Node> stack=new Stack<>();
     * stack.push(node);
     * while(!stack.isEmpty())
     * {
     *      Node n=stack.pop();
     *      System.out.println(n.data);
     *      int size=n.children.size();
     *      for(int i=size-1;i>=0;i--)
     *      {
     *          stack.push(n.children.get(i));
     *      }
     * }
     */

    static void postOrder(Node node)
    {
        if(node==null)
            return;
        int size=node.children.size();
        for(int i=0;i<size;i++)
        {
            postOrder(node.children.get(i));
        }
        System.out.print(node.data+" ");
    }

}