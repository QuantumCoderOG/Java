package src.binarytree;

class BinaryTree {
    Node root;

    // Pre-order traversal (Root, Left, Right)
    void preOrder(Node node) {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // In-order traversal (Left, Root, Right)
    void inOrder(Node node) {
        if (node == null)
            return;
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    // Post-order traversal (Left, Right, Root)
    void postOrder(Node node) {
        if (node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Pre-order traversal:");
        tree.preOrder(tree.root); // Output: 1 2 4 5 3

        System.out.println("\nIn-order traversal:");
        tree.inOrder(tree.root);  // Output: 4 2 5 1 3

        System.out.println("\nPost-order traversal:");
        tree.postOrder(tree.root); // Output: 4 5 2 3 1
    }
}