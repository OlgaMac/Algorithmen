package com.algorithmen.tasks;

/**
 * Дан массив чисел. Требуется найти такое число, которое равномерно
 * удаленно от минимума и максимума;
 */

public class Task4 {
    static int minDiff(int[] numbers) {
        int max = numbers[0];
        int min = numbers[0];
        double med = 0;
        int j = 0;

        if(numbers.length <= 2 ){
            return 0;
        }

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            } else if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        med = (max + min) / 2.0;
        min = 0;
        double diff = 1000;
        int result = 0;

        while (j < numbers.length) {
            double differencePartial = Math.abs(med - numbers[j] / 1.0);
            if (differencePartial < diff) {
                diff = differencePartial;
                result = numbers[j];
            }
            j++;
        }
        return result;
    }
}
