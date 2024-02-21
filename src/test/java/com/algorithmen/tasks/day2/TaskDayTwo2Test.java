package com.algorithmen.tasks.day2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.algorithmen.tasks.day2.TaskDayTwo2.reverseString;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class TaskDayTwo2Test {
    @Test
    void test1() {
        String text = "abs";
        String expected = "sba";

        assertEquals(expected, reverseString(text));
    }
}