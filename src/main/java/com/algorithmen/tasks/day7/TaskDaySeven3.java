package com.algorithmen.tasks.day7;

import com.algorithmen.tasks.day2.BinaryTree;
import com.algorithmen.tasks.day3.tree.Node;
import com.algorithmen.tasks.day3.tree.TreeCustom;

import static com.algorithmen.tasks.day3.tree.BTreePrinter.printNode;

/**
 * Написать проверку является ли дерево бинарным деревом поиска;
 */
public class TaskDaySeven3 {

    private static boolean isBinaryTree(Node root) {
        return checkIfBinarySearchTree(root, null, null);
    }
    public static boolean checkIfBinarySearchTree(Node root, Integer max, Integer min) {
        if (root == null) return true;
        if (max != null && root.getValue().compareTo(max) >= 0) return false;
        if (min != null && root.getValue().compareTo(min) < 0) return false;
        return checkIfBinarySearchTree(root.getLeft(), (int) root.getValue(), min) &&
                checkIfBinarySearchTree(root.getRight(), max, (int) root.getValue());
    }


    public static void main(final String[] args)
    {
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

        TreeCustom treeCustom = new TreeCustom();
        treeCustom.insert(5);
        treeCustom.insert(7);
        treeCustom.insert(3);
        treeCustom.insert(4);
        treeCustom.insert(6);
        treeCustom.insert(9);
        treeCustom.insert(2);
        treeCustom.insert(10);
        treeCustom.insert(1);
        treeCustom.insert(0);


        System.out.println(isBinaryTree(tree.getRoot()));
        System.out.println(isBinaryTree(treeCustom.getRoot()));
    }
}
