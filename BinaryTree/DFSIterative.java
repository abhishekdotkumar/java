package BinaryTree;

import java.util.Stack;

public class DFSIterative {
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

        Stack<Node> stack = new Stack<>();

        stack.push(root);

        /*
         * // Pre-Order Traversal
         * 
         * while (!stack.isEmpty()) {
         * int size = stack.size();
         * 
         * for (int i = 0; i < size; i++) {
         * 
         * Node val = stack.pop();
         * 
         * if (val.right != null) {
         * stack.push(val.right);
         * }
         * if (val.left != null) {
         * stack.push(val.left);
         * }
         * 
         * System.out.print(val.data + " ");
         * }
         * }
         */

        // In order Traversal
        stack.clear();
        Node node = root;
        while (true) {
            if (node != null) {
                stack.push(node);
                node = node.left;
            } else {
                if (stack.isEmpty()) {
                    break;
                } else {
                    node = stack.pop();
                    System.out.print(node.data + " ");
                    node = node.right;
                }

            }
        }

    }
}
