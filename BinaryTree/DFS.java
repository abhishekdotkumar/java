package BinaryTree;

public class DFS {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(0);

        root.data = 1;
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(6);

        root.right.left = new Node(7);
        root.right.right = new Node(8);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);
        System.out.println("preorder");
        print(root, "preorder");
        System.out.println("postorder");
        print(root, "postorder");
        System.out.println("inorder");
        print(root, "inorder");
    }

    public static void print(Node root, String type) {
        if (root == null) {
            return;
        }

        if (type == "inorder") {
            print(root.left, "inorder");
            System.out.print(root.data + " ");
            print(root.right, "inorder");
        }

        if (type == "postorder") {
            print(root.left, "postorder");
            print(root.right, "postorder");
            System.out.print(root.data + " ");
        }

        if (type == "preorder") {
            System.out.print(root.data + " ");
            print(root.left, "preorder");
            print(root.right, "preorder");
        }
    }
}
