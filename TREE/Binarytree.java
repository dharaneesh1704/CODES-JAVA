
import java.util.LinkedList;
import java.util.Queue;

class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

class Tree
{
    static Node root;
    void insert(int data)
    {
        Node newNode=new Node(data);
        if(root==null)
            root=newNode;
        else
        {
            Queue<Node> queue=new LinkedList<>();
            queue.add(root);
            while(!queue.isEmpty())
            {
                Node n=queue.poll();
                if(n.left!=null)
                {
                    queue.add(n.left);
                }
                else
                {
                    n.left=newNode;
                    break;
                }
                if(n.right!=null)
                {
                    queue.add(n.right);
                }
                else
                {
                    n.right=newNode;
                    break;
                }
            }
        }

    }

    static void inOrder()
    {
        InOrder(root);
        System.out.println();
    }

    static void InOrder(Node curr)
    {
        if(curr==null)
            return;
        InOrder(curr.left);
        System.out.print(curr.data+" ");
        InOrder(curr.right);

    }

    static void preOrder()
    {
        PreOrder(root);
        System.out.println();
    }

    static void PreOrder(Node curr)
    {
        if(curr==null)
            return;
        System.out.print(curr.data+" ");
        PreOrder(curr.left);
        PreOrder(curr.right);
    }

    static void postOrder()
    {
        PostOrder(root);
        System.out.println();
    }

    static void PostOrder(Node curr)
    {
        if(curr==null)
            return;
        PostOrder(curr.left);
        PostOrder(curr.right);
        System.out.print(curr.data+" ");

    }
    

    void levelOrder()
    {
        Node curr=root;
        Queue<Node> queue=new LinkedList<>();
        queue.add(curr);
        while(!queue.isEmpty())
        {
            Node n=queue.poll();
            System.out.print(n.data+" ");
            if(n.left!=null)
                queue.add(n.left);
            if(n.right!=null)
                queue.add(n.right);
        }
        System.out.println();
    }
}


public class Binarytree 
{
    public static void main(String[] args) 
    {
        Tree tree=new Tree();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        
        tree.levelOrder();
        tree.inOrder();
        tree.preOrder();
        tree.postOrder();
    }
}
