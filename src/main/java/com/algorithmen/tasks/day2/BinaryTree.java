package com.algorithmen.tasks.day2;

import com.algorithmen.tasks.day3.tree.Node;

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

        if ( current.getValue().compareTo(value) == 1) {
            current.setLeft(addRecursive(current.getLeft(), value));
        } else if (current.getValue().compareTo(value) != 1) {
            current.setRight(addRecursive(current.getRight(), value));
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
            System.out.print(" " + tn.getValue());
            depthTraversal(tn.getLeft());
            depthTraversal(tn.getRight());
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

            System.out.print(" " + node.getValue());

            if (node.getLeft() != null) {
                nodes.add(node.getLeft());
            }

            if (node.getRight() != null) {
                nodes.add(node.getRight());
            }
        }
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
}
