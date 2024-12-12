package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

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

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(6);

        root.right.left = new Node(7);
        root.right.right = new Node(8);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        // print(root, queue);

        ArrayList<ArrayList<Integer>> arr = printAsList(root, queue);

        for (ArrayList<Integer> innerList : arr) {
        System.out.println(innerList);
        }

    }

    public static ArrayList<ArrayList<Integer>> printAsList(Node root, Queue<Node> queue) {

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        if (root == null) {
            return arr;
        }

        while (!queue.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {

                if (queue.peek().left != null) {
                    queue.add(queue.peek().left);
                }
                if (queue.peek().right != null) {
                    queue.add(queue.peek().right);
                }
                list.add(queue.peek().data);
                queue.poll();
            }
            arr.add(list);
        }

        return arr;
    }

    public static void print(Node root, Queue<Node> queue) {
        if (root == null) {
            return;
        }

        if (!queue.isEmpty()) {
            if (root.left != null) {
                queue.add(root.left);
            }
            if (root.right != null) {
                queue.add(root.right);
            }
            System.out.print(queue.poll().data + " ");
        }

        print(queue.peek(), queue);

    }
}