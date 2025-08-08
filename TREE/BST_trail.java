
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
    }
}

class Tree
{
    Node root;
    void insert(int data)
    {
        Node newNode=new Node(data);
        if(root==null)
        {
            root=newNode;
        }
        else
        {
            Node curr=root;
            while (true) 
            { 
                if(curr.data>newNode.data)
                {
                    if(curr.left==null)
                    {
                        curr.left=newNode;
                        break;
                    }
                    else
                        curr=curr.left;
                }
                else
                {
                    if(curr.right==null)
                    {
                        curr.right=newNode;
                        break;
                    }
                    else
                        curr=curr.right;
                }
            }
        }
    }
    void inOrder()
    {
        Node curr=root;
        InOrder(curr);
    }
    void InOrder(Node curr)
    {
        if(curr==null)
            return;
        InOrder(curr.left);
        System.out.print(curr.data+" ");
        InOrder(curr.right);
    }

    void preOrder()
    {
        Node curr=root;
        PreOrder(curr);
    }
    void PreOrder(Node curr)
    {
        if(curr==null)
            return;
        System.out.print(curr.data+" ");
        PreOrder(curr.left);
        PreOrder(curr.right);
    }

    void postOrder()
    {
        Node curr=root;
        PostOrder(curr);
    }
    void PostOrder(Node curr)
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
        LevelOreder(curr);
    }
    void LevelOreder(Node curr)
    {
        Queue<Node> queue=new LinkedList<>();
        queue.add(curr);
        while(!queue.isEmpty())
        {
            Node temp=queue.poll();
            System.out.print(temp.data+" ");
            if(temp.left!=null)
                queue.add(temp.left);
            if(temp.right!=null)
                queue.add(temp.right);
        }
    }

    void delete(int data) 
    {
        Node curr = root;
        //if element is leaf node
        while(curr!=null)
        {
            if(curr.data>data)
            {
                curr=curr.left;
            }
            else if(curr.data<data)
            {
                curr=curr.right;
            }
            else
            {
                break;
            }
        }

        if(curr==null)
        {
            System.out.println("Element not found");
            return;
        }
        else if(curr.left==null && curr.right==null)
        {
            if(curr.data==data)
            {
                curr=null;
            }
        }
        else if(curr.left!=null && curr.right==null)
        {
            if(curr.data==data)
            {
                curr=curr.left;
            }
        }
        else if(curr.left==null && curr.right!=null)
        {
            if(curr.data==data)
            {
                curr=curr.right;
            }
        }
        else
        {
            Node temp=curr.right;
            while(temp.left!=null)
            {
                temp=temp.left;
            }
            curr.data=temp.data;
            delete(temp.data);
        }
    }

}
public class BST_trail 
{
    public static void main(String[] args) 
    {
        Tree tree=new Tree();
        tree.insert(40);
        tree.insert(20);
        tree.insert(60);
        tree.insert(10);
        tree.insert(30);
        tree.insert(50);

        System.out.println("InOrder:------");
        tree.inOrder();
        System.out.println();

        System.out.println("preorder-------");
        tree.preOrder();
        System.out.println();

        System.out.println("postorder------");
        tree.postOrder();
        System.out.println();

        System.out.println("levelOrder-----");
        tree.levelOrder();
        System.out.println();
    }    
}
