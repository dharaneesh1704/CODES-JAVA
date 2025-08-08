class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

class Tree {
    Node root;

    void insert_rec(int data) {
        root = insertRecursive(root, data);
    }

    Node insertRecursive(Node curr, int data) {
        if (curr == null)
            return new Node(data);

        if (data < curr.data)
            curr.left = insertRecursive(curr.left, data);
        else
            curr.right = insertRecursive(curr.right, data);

        return curr;
    }

    void inOrder() {
        inOrderTraversal(root);
    }

    void inOrderTraversal(Node curr) {
        if (curr == null) return;
        inOrderTraversal(curr.left);
        System.out.println(curr.data);
        inOrderTraversal(curr.right);
    }
}

public class BST {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert_rec(40);
        tree.insert_rec(20);
        tree.insert_rec(60);
        tree.insert_rec(10);
        tree.insert_rec(30);
        tree.insert_rec(50);
        tree.inOrder();
    }
}
