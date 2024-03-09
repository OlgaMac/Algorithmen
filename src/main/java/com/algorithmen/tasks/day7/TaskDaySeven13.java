package com.algorithmen.tasks.day7;

/**
 * Вывести первые N простых чисел.
 */
public class TaskDaySeven13 {

    public static int findNfirst(int[] arr) {

        int count = 0;

        for (int i = 0; i < arr.length; i++)
            if (isPrime(arr[i])) {
                count++;
            }
        return count;
    }

    private static boolean isPrime(int num) {
        if (num <= 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(final String[] args) {
        int[] expected = {1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12};

        System.out.println(findNfirst(expected));

    }
}
