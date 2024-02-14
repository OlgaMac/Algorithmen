package com.algorithmen.tasks;

/**
 * Дан массив целых чисел. Требуется удалить из него все вхождения
 * заданного числа;
 */

public class Task2 {
    static int[] moveNumber(int[] array, int number) {
        int count = 0;
        int j = 0;
        int k = 0;
        if (array.length == 0) {
            return array;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                count++;
            }
        }
        int[] result = new int[array.length - count];

        while (j < result.length) {
            if (array[k] != number) {
                result[j] = array[k];
                j++;
            }
            k++;
        }

        return result;
    }
}
