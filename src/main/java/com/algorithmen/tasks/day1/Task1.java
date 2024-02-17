package com.algorithmen.tasks.day1;

/**
 * Даны три числа a,b,c. Требуется найти среди них медиану (серединное
 * значение в отсортированной последовательности);
 *
 * */

public class Task1 {

    static int findMedian(int a, int b, int c) {
        if ((a - b) * (c - a) >= 0) {              // a >= b and a <= c OR a <= b and a >= c
            return a;
        } else if ((b - a) * (c - b) >= 0) {       // b >= a and b <= c OR b <= a and b >= c
            return b;
        } else {
            return c;
        }
    }
}
