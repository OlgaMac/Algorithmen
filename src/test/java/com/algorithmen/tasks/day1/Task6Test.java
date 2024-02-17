package com.algorithmen.tasks.day1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

import static com.algorithmen.tasks.day1.Task6.moveArray;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class Task6Test {
    @Test
    void test1() {
        int[] expected = {10, 15,1,6,7,5,5,4,9,11,16};
        int[] given = {1,6,7,5,5,4,9,11,16,10,15};

        assertEquals(Arrays.toString(expected), Arrays.toString(moveArray(given, 2)));
    }

    @Test
    void test2() {
        int[] expected = {1};
        int[] given = {1};

        assertEquals(Arrays.toString(expected), Arrays.toString(moveArray(given, 1)));
    }
}