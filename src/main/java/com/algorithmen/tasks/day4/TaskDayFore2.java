package com.algorithmen.tasks.day4;

/**
 * Дан массив целых чисел. Требуется определить, является ли он кучей;
 */
public class TaskDayFore2 {
    static boolean isHeap(int arr[], int i, int n) {
        if (i >= (n - 1) / 2) {
            return true;
        }

        if (arr[i] >= arr[2 * i + 1]
                && arr[i] >= arr[2 * i + 2]
                && isHeap(arr, 2 * i + 1, n)
                && isHeap(arr, 2 * i + 2, n)) {
            return true;
        }

        return false;
    }

    public static void main(final String[] args) {
        int[] arr = {5, 3, 6, 2, 1};
        int n = arr.length - 1;

        System.out.println(isHeap(arr, 0, n));
    }
}
