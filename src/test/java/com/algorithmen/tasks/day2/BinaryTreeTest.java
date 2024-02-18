package com.algorithmen.tasks.day2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class BinaryTreeTest {
    @Test
    void test1() {
        BinaryTree tree = new BinaryTree();
        tree.add(5);
        tree.add(7);
        tree.add(9);
        tree.add(3);
        tree.add(2);
        tree.add(10);

        tree.traverseLevelOrder();
        System.out.println();
        tree.depthOrderTraversalWithRecursive();

    }
}