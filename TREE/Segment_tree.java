class Node
{
    int st,end,sum;
    Node left,right;
    Node(int s,int e,int sum)
    {
        this.st=s;
        this.end=e;
        this.sum=sum;
    }
}


class Tree
{
    static Node root;
    public void insert(int arr[],int st,int end,int sum)
    {
        Node node = new Node(st, end, sum);
        if(root==null)
            root=node;
        else
        {
            int mid=st+(end-st)/2;
            
            root.left=insert(arr,st,mid-1,sum);
            root.right=insert(arr, mid+1, end, sum);
            
        }
    }
}


class Segment_tree
{
    public static void main(String[] args) 
    {
        Tree tree=new Tree();
        int arr[]={1,2,3,4,5,6};
        int sum=21;
        tree.insert=(int[] arr,0,arr.length-1,sum);
        
    }
}