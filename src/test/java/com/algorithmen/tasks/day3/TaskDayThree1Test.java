package com.algorithmen.tasks.day3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static com.algorithmen.tasks.day3.TaskDayThree1.findBuildings;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class TaskDayThree1Test {
    @Test
    void test1() {
        List<Integer> expected = List.of(4, 5, 6, 7, 2);
        List<Integer> given = List.of(1, 7, 6, 5, 2, 1, 4);

        assertEquals(expected.toString(), findBuildings(given, 2).toString());
    }
    @Test
    void test2() {
        List<Integer> expected = List.of(8);
        List<Integer> given = List.of(1, 7, 6, 5, 2, 1, 4);

        assertEquals(expected.toString(), findBuildings(given, 8).toString());
    }
}