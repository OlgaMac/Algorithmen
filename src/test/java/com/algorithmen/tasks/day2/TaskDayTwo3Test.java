package com.algorithmen.tasks.day2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TaskDayTwo3Test {
    @Test
    void test1() {
        Integer[] list = { 4, 3, 2, 1 };

        LinkedListCustom<Integer> linkedList = new LinkedListCustom<>(list);

        linkedList.printList();
        linkedList.reverseList();
        linkedList.printList();
    }
}