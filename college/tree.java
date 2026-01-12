package college;

public class tree {
    class Node {
        int value;
        Node left, right;
        Node(int val) {
            value = val;
            left = right = null;
        }
    }

    Node root;

    tree() {
        root = null;
    }

    Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (val < root.value)
            root.left = insert(root.left, val);
        else if (val > root.value)
            root.right = insert(root.right, val);
        return root;
    }
    void insert(int val){
        root = insert(root, val);
    }

    void inorder(Node root){
        if(root != null){
            inorder(root.left);
            inorder(root.right);
        }
    }



    public static void main(String[] args) {
        tree bst = new tree();
        bst.insert(90);


        System.out.print("traversal ");
        bst.inorder(bst.root);
    }
}
