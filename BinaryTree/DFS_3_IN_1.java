package BinaryTree;

import java.util.ArrayList;
import java.util.Stack;

public class DFS_3_IN_1 {

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

    static class Custom {
        Node node;
        int increment;

        Custom(Node node, int increment) {
            this.node = node;
            this.increment = increment;
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

        Stack<Custom> stack = new Stack<>();

        Custom code = new Custom(root, 1);

        ArrayList<Integer> preorder = new ArrayList<>();
        ArrayList<Integer> inorder = new ArrayList<>();
        ArrayList<Integer> postorder = new ArrayList<>();

        stack.push(code);

        while (!stack.isEmpty()) {
            code = stack.peek();
            if (code.increment == 1) {
                // Add in preorder
                preorder.add(code.node.data);
                // increment the count by 1
                code = new Custom(code.node, code.increment + 1);
                // remove the old value and and insert the new object with count + 1 value
                stack.pop();
                stack.push(code);

                // check if node.left is empty, if not then push it into stack
                if (code.node.left != null) {
                    code = new Custom(code.node.left, 1);
                    stack.push(code);
                }
            } else if (code.increment == 2) {
                // Add in preorder
                inorder.add(code.node.data);
                // increment the count by 1
                code = new Custom(code.node, code.increment + 1);
                // remove the old value and and insert the new object with count + 1 value
                stack.pop();
                stack.push(code);

                // check if node.left is empty, if not then push it into stack
                if (code.node.right != null) {
                    code = new Custom(code.node.right, 1);
                    stack.push(code);
                }
            } else {
                // Add in preorder
                postorder.add(code.node.data);
                stack.pop();

            }
        }

        System.out.printf("preorder: ");
        System.out.println(preorder);
        System.out.printf("inorder: ");
        System.out.println(inorder);
        System.out.printf("postorder: ");
        System.out.println(postorder);
    }
}
