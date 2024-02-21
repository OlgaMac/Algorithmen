package com.algorithmen.tasks.day2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static com.algorithmen.tasks.day2.TaskDayTwo1.moveArray;
import static com.algorithmen.tasks.day2.TaskDayTwo1.moveArray2;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class TaskDayTwo1Test {
    @Test
    void test1() {
        int[] expected = {1, 5, 6, 7, 9, 10, 11, 15, 16};
        int[] given1 = {1,6,7,5};
        int[] given2 = {9,11,16,10,15};

        assertEquals(Arrays.toString(expected), Arrays.toString(moveArray(given1, given2)));
    }

    @Test
    void test2() {
        int[] expected = {1, 5, 6, 7, 9, 10, 11, 15, 16};
        int[] given1 ={9,11,16,10,15};
        int[] given2 = {1,6,7,5};

        assertEquals(Arrays.toString(expected), Arrays.toString(moveArray(given1, given2)));
    }

    @Test
    void test3() {
        int[] expected = {};
        int[] given1 ={};
        int[] given2 = {};

        assertEquals(Arrays.toString(expected), Arrays.toString(moveArray(given1, given2)));
    }

    @Test
    void test4() {
        int[] expected = {1};
        int[] given1 ={};
        int[] given2 = {1};

        assertEquals(Arrays.toString(expected), Arrays.toString(moveArray(given1, given2)));
    }

    @Test
    void test5() {
        List<Integer> expected = List.of(1, 5, 6, 7, 9, 10, 11, 15, 16);
        List<Integer> given1 =List.of(9,11,16,10,15);
        List<Integer> given2 = List.of(1,6,7,5);

        assertEquals(expected.toString(),moveArray2(given1, given2).toString());
    }

    @Test
    void test6() {
        List<Integer> expected = Collections.EMPTY_LIST;
        List<Integer> given1 = Collections.EMPTY_LIST;
        List<Integer> given2 = Collections.EMPTY_LIST;

        assertEquals(expected.toString(),moveArray2(given1, given2).toString());
    }

    @Test
    void test7() {
        List<Integer> expected = List.of(1);
        List<Integer> given1 = List.of(1);
        List<Integer> given2 = Collections.EMPTY_LIST;

        assertEquals(expected.toString(),moveArray2(given1, given2).toString());
    }
}