package com.algorithmen.tasks;

/**
 * Дано неотрицательное число. Требуется перевернуть его;
 */

public class Task3 {
    static int revertNumber(int number) {
        String result = "";
        if(number < 10){
            return number;
        }

        while(number > 0){
            int diff = number%10;
            number = number/10;
            result  = result + diff;
        }

        return Integer.parseInt(result);

    }
}
