package com.algorithmen.tasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

import static com.algorithmen.tasks.Task2.moveNumber;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class Task2Test {
    @Test
    void test1() {
        int[] expected = {};
        int[] given = {};
        assertEquals(Arrays.toString(expected), Arrays.toString(moveNumber(given, 1)));
    }

    @Test
    void test2() {
        int[] expected = {1,5,6,7,5,9,11};
        int[] given = {1,5,8,6,8,7,5,9,11};
        assertEquals(Arrays.toString(expected), Arrays.toString(moveNumber(given, 8)));
    }

    @Test
    void test3() {
        int[] expected = {};
        int[] given = {1};
        assertEquals(Arrays.toString(expected), Arrays.toString(moveNumber(given, 1)));
    }

}