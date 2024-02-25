package com.algorithmen.tasks.day3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static com.algorithmen.tasks.day3.TaskDayThree2.buildThree;
import static com.algorithmen.tasks.day3.tree.BTreePrinter.printNode;

@ExtendWith(MockitoExtension.class)
class TaskDayThree2Test {
    @Test
    void test1() {
        List<Integer> given = List.of(1, 2, 3, 4, 5, 6);
        printNode(buildThree(given).getRoot());
    }

}