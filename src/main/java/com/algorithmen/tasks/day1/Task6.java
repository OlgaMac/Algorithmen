package com.algorithmen.tasks.day1;

/**
 * Сдвинуть массив циклически на k-позиций влево;
 */

public class Task6 {
    static int[] moveArray(int[] array, int k) {
        if(k > array.length || array.length < 2){
            return array;
        }

        int[] result = new int[array.length];
        int i = 0;
        int j= 0;
        int diff = k;

        while (i < array.length - k) {
            if(j < k) {
                result[j] = array[array.length - diff];
                diff--;
            }else{
                result[j] = array[i];
                i++;
            }
            j++;
        }

        return result;
    }
}
