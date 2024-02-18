package com.algorithmen.tasks.day2;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Реализовать обходы бинарного дерева;
 */

public class BinaryTree {
    Node root;
    public BinaryTree(){
        root = null;
    }

    public Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.root) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.root) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    public void depthOrderTraversalWithRecursive()
    {
        depthTraversal(root);
    }

    private void depthTraversal(Node tn)
    {
        if (tn!=null)
        {
            System.out.print(" " + tn.root);
            depthTraversal(tn.left);
            depthTraversal(tn.right);
        }
    }

    public void traverseLevelOrder() {
        if (root == null) {
            return;
        }

        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);

        while (!nodes.isEmpty()) {

            Node node = nodes.remove();

            System.out.print(" " + node.root);

            if (node.left != null) {
                nodes.add(node.left);
            }

            if (node.right != null) {
                nodes.add(node.right);
            }
        }
    }

    public static class Node {
        private int root;
        private Node left;
        private Node right;

        public Node(int rootData) {
            root = rootData;
            left = null;
            right = null;
        }
    }
}
