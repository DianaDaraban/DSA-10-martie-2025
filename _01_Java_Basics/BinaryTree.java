public class BinaryTree{
    class Node{
        int data;
        Node left, right;

        public Node(int value){
        this.data = value;
        this.left = null;
        this.right = null;
    }
    }

    Node root;
    public BinaryTree(){
        this.root = null;
    }

    public static void preorder(Node root){
        if(root !=null){
            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void inorder(Node root){
        if(root !=null){
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
    }

    public static void postorder(Node root){
        if(root !=null){
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.data);
        }
    }

    public static void main(String[ args]){
        BinaryTree tree = new BinaryTree();
        tree.root = tree.new Node(5);
        tree.root.left = tree.new Node(3);
        tree.root.right = tree.new Node(8);
        tree.root.left.left = tree.new Node(2);
        tree.root.left.right = tree.new Node(4);


        preorder(tree.root);
        inorder(tree.root);
    }
    
}