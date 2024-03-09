package com.algorithmen.tasks.day7;

import com.algorithmen.tasks.day2.BinaryTree;
import com.algorithmen.tasks.day3.tree.Node;

import static com.algorithmen.tasks.day3.tree.BTreePrinter.printNode;

/**
 * Вычислить высоту дерева;
 */
public class TaskDaySeven9 {

    public static int calculateHeight(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = calculateHeight(root.getLeft());
        int rightHeight = calculateHeight(root.getRight());

        return Math.max(leftHeight, rightHeight) + 1;

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

        System.out.println(calculateHeight(tree.getRoot()));

    }
}
