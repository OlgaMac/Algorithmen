package com.algorithmen.tasks.day1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.algorithmen.tasks.day1.Task1.findMedian;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class Task1Test {
    @Test
    void test1() {
        assertEquals(5, findMedian(1, 5, 8));
    }

    @Test
    void test2() {
        assertEquals(1, findMedian(1, 1, 8));
    }

    @Test
    void test3() {
        assertEquals(8, findMedian(1, 8, 8));
    }

}