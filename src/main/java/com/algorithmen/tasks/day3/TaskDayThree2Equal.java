package com.algorithmen.tasks.day3;

import com.algorithmen.tasks.day3.tree.Node;

/**
 * Дан массив. Требуется сконструировать из него бинарное дерево.
 */

public class TaskDayThree2Equal {

    // эквивалентность
    public static boolean equalsCustom(Node root1, Node root2) {
        if(root1 == root2){
            return true;
        }

        if (root1 == null || root2 == null) {
            return false;
        }
        return root1.getValue().equals(root2.getValue()) &&
                equalsCustom(root1.getLeft(), root2.getLeft()) &&
                equalsCustom(root1.getRight(), root2.getRight());
    }

    // симметричность
    public static boolean equalSymmetry(Node root1, Node root2) {
        if(root1 == root2){
            return true;
        }

        if (root1 == null || root2 == null) {
            return false;
        }
        return root1.getValue().equals(root2.getValue()) &&
                equalSymmetry(root1.getLeft(), root2.getRight()) &&
                equalSymmetry(root1.getRight(), root2.getLeft());
    }
}
