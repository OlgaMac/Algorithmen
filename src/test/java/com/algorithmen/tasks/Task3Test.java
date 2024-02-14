package com.algorithmen.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.algorithmen.tasks.Task3.revertNumber;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class Task3Test {
    @Test
    void test1() {
        assertEquals(2001, revertNumber(1002));
    }

    @Test
    void test2() {
        assertEquals(1, revertNumber(1000));
    }

    @Test
    void test3() {
        assertEquals(9, revertNumber(9));
    }

    @Test
    void test4() {
        assertEquals(52, revertNumber(25));
    }

}