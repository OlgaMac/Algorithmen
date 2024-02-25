package com.algorithmen.tasks.day3;

import com.algorithmen.tasks.day2.BinaryTree;

import java.util.List;

/**
 * Дан массив. Требуется сконструировать из него бинарное дерево.
 */

public class TaskDayThree2 {
    static BinaryTree buildThree(List<Integer> array) {

        BinaryTree binaryTree = new BinaryTree();
        for (int a = 0; a <= array.size(); a++) {
            binaryTree.add(a);
        }
        return binaryTree;
    }
}
