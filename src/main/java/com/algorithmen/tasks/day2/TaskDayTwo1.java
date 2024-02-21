package com.algorithmen.tasks.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Даны два упорядоченных массива. Требуется выполнить слияние этих массивов в
 * новый массив.
 */

public class TaskDayTwo1 {

    // Solution 1
    static int[] moveArray(int[] array, int[] array2) {
        if (array.length == 0 && array2.length == 0) {
            return array;
        }
        int n = array.length + array2.length;
        int[] result = new int[n];
        int i = 0;
        int j = 0;
        int k = 0;

        while (k < n) {
            if (i < array.length) {
                result[k] = array[i];
                i++;
            } else {
                result[k] = array2[j];
                j++;
            }
            k++;
        }

        for (int a = 0; a < result.length; a++) {
            for (int b = 0; b < result.length - 1; b++) {
                if (result[b] > result[b + 1]) {
                    int temp = result[b];
                    result[b] = result[b + 1];
                    result[b + 1] = temp;
                }
            }
        }
        return result;
    }

    // Solution 2
    static List<Integer> moveArray2(List<Integer> arrayFirst, List<Integer> arraySecond) {
        if (arrayFirst.size() == 0 && arraySecond.size() == 0) {
            return arrayFirst;
        }
        List<Integer> result = new ArrayList<>(arrayFirst.size() + arraySecond.size());
        result.addAll(arrayFirst);
        result.addAll(arraySecond);
        Collections.sort(result);
        return result;
    }
}
