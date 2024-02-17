package com.algorithmen.tasks.day1;

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
        
        double diff = Math.abs(med - numbers[0] / 1.0);;
        int result = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            if(Math.abs(med - numbers[i] / 1.0) < diff){
                diff = Math.abs(med - numbers[i] / 1.0);
                result = numbers[i];
            }
        }
        return result;
    }
}
