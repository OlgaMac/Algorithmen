package com.algorithmen.tasks;

/**
 * Посчитать количество единиц в двоичной записи числа;
 */

public class Task5 {
    static int countOne(int number) {
        int count = 0;

        while (number != 0) {
            int d = number % 2;
            if (d == 1)
                count++;
            number = number / 2;
        }
        return count;
    }
}
