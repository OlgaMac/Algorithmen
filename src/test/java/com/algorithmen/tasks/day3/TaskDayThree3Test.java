package com.algorithmen.tasks.day3;

import com.algorithmen.tasks.day3.tree.BinaryTreeCustom;
import com.algorithmen.tasks.day3.tree.TreeCustom;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.algorithmen.tasks.day3.tree.BTreePrinter.printNode;
import static com.algorithmen.tasks.day3.TaskDayThree2Equal.equalSymmetry;
import static com.algorithmen.tasks.day3.TaskDayThree2Equal.equalsCustom;

@ExtendWith(MockitoExtension.class)
class TaskDayThree3Test {
    @Test
    void test1() {
        BinaryTreeCustom tree = new BinaryTreeCustom();
        tree.add(5);
        tree.add(7);
        tree.add(9);
        tree.add(3);
        tree.add(2);
        tree.add(10);

        BinaryTreeCustom tree2 = new BinaryTreeCustom();
        tree2.add(5);
        tree2.add(7);
        tree2.add(9);
        tree2.add(3);
        tree2.add(2);
        tree2.add(10);

        System.out.println(equalsCustom(tree.getRoot(), tree2.getRoot()));
    }

    @Test
    void test2() {
        TreeCustom tree = new TreeCustom();
        tree.insert(5);
        tree.insert(7);
        tree.insert(9);
        tree.insert(3);
        tree.insert(2);
        tree.insert(10);
        tree.insert(1);

        TreeCustom tree2 = new TreeCustom();
        tree2.insert(5);
        tree2.insert(9);
        tree2.insert(7);
        tree2.insert(1);
        tree2.insert(10);
        tree2.insert(2);
        tree2.insert(3);

        printNode(tree.getRoot());
        printNode(tree2.getRoot());

        System.out.println(equalSymmetry(tree.getRoot(), tree2.getRoot()));
    }
}