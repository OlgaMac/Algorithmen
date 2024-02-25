package com.algorithmen.tasks.day3;

import com.algorithmen.tasks.day3.tree.TreeCustom;

import java.util.List;

/**
 * Дан массив. Требуется сконструировать из него бинарное дерево.
 */

public class TaskDayThree2 {
    static TreeCustom buildThree(List<Integer> array) {

        TreeCustom tree = new TreeCustom();
        for (int a = 0; a <= array.size(); a++) {
            tree.insert(a);
        }
        return tree;
    }
}
