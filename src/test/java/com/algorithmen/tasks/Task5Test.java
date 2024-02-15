package com.algorithmen.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.algorithmen.tasks.Task5.countOne;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class Task5Test {
    @Test
    void test1() {
        assertEquals(3, countOne(560));
    }

    @Test
    void test2() {
        assertEquals(1, countOne(8));
    }

    @Test
    void test3() {
        assertEquals(8, countOne(255));
    }
}