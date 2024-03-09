package com.algorithmen.tasks.day7;

import com.algorithmen.tasks.day2.BinaryTree;
import com.algorithmen.tasks.day3.tree.Node;

import static com.algorithmen.tasks.day3.tree.BTreePrinter.printNode;

/**
 * Дано бинарное дерево. Требуется для двух вершин найти их наименьшего общего предка;
 */
public class TaskDaySeven5 {

    public static int commonParent(Node root, int a, int b) {
        Node lcaNode = findLowestCommonAncestor(root, a, b);
        return (lcaNode != null) ? (int) lcaNode.getValue() : -1; // Return -1 if no common ancestor found
    }

    private static Node findLowestCommonAncestor(Node root, int a, int b) {
        if (root == null || root.getValue().equals(a) ||  root.getValue().equals(b)) {
            return root;
        }

        Node leftLCA = findLowestCommonAncestor(root.getLeft(), a, b);
        Node rightLCA = findLowestCommonAncestor(root.getRight(), a, b);

        if (leftLCA != null && rightLCA != null) {
            return root;
        }

        return (leftLCA != null) ? leftLCA : rightLCA;
    }


    public static void main(final String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.add(5);
        tree.add(7);
        tree.add(3);
        tree.add(4);
        tree.add(6);
        tree.add(9);
        tree.add(2);
        tree.add(10);
        tree.add(1);
        tree.add(0);

        printNode(tree.getRoot());

        System.out.println(commonParent(tree.getRoot(), 6, 10));

    }
}
