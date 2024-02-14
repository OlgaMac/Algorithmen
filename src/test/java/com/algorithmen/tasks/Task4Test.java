package com.algorithmen.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.algorithmen.tasks.Task4.minDiff;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class Task4Test {
    @Test
    void test1() {
        int[] given = {1,6,7,5,5,4,9,11,16,10,15};

        assertEquals(9, minDiff(given));
    }

    @Test
    void test2() {
        int[] given = {1};

        assertEquals(0, minDiff(given));
    }

    @Test
    void test3() {
        int[] given = {1,6};

        assertEquals(0, minDiff(given));
    }

    @Test
    void test5() {
        int[] given = {5,5,5,5,5,5,5,5};

        assertEquals(5, minDiff(given));
    }
}