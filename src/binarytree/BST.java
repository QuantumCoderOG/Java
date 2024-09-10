package src.binarytree;

class BST {
    Node root;

    // Inserting a node in BST
    void insert(int data) {
        root = insertRec(root, data);
    }

    Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data)
            root.left = insertRec(root.left, data);
        else if (data > root.data)
            root.right = insertRec(root.right, data);

        return root;
    }

    // In-order traversal (Left, Root, Right)
    void inOrder(Node root) {
        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    // Pre-order traversal (Root, Left, Right)
    void preOrder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // Post-order traversal (Left, Right, Root)
    void postOrder(Node root) {
        if (root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    // Deleting a node in BST
    void delete(int key) {
        root = deleteRec(root, key);
    }

    Node deleteRec(Node root, int key) {
        if (root == null)
            return root;

        if (key < root.data)
            root.left = deleteRec(root.left, key);
        else if (key > root.data)
            root.right = deleteRec(root.right, key);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.data = minValue(root.right);
            root.right = deleteRec(root.right, root.data);
        }
        return root;
    }

    int minValue(Node root) {
        int minVal = root.data;
        while (root.left != null) {
            minVal = root.left.data;
            root = root.left;
        }
        return minVal;
    }

    public static void main(String[] args) {
        BST tree = new BST();

        // Insert nodes into the BST
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("In-order traversal:");
        tree.inOrder(tree.root);  // Output: 20 30 40 50 60 70 80

        System.out.println("\nPre-order traversal:");
        tree.preOrder(tree.root); // Output: 50 30 20 40 70 60 80

        System.out.println("\nPost-order traversal:");
        tree.postOrder(tree.root); // Output: 20 40 30 60 80 70 50

        // Delete node with key 20
        System.out.println("\nDeleting node 20");
        tree.delete(20);

        System.out.println("In-order traversal after deletion:");
        tree.inOrder(tree.root);  // Output: 30 40 50 60 70 80
    }
}
//
//            50
//           /  \
//         30    70
//         /  \   /  \
//         20  40 60   80