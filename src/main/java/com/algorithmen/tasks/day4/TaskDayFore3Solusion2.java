package com.algorithmen.tasks.day4;

import java.util.ArrayList;
import java.util.List;

/**
 * Дан массив целых чисел. Требуется найти k-минимальных элементов;
 */
public class TaskDayFore3Solusion2 {
    static List<Integer> findMinValue(int arr[], int num) {
        List<Integer> list = new ArrayList<>();
        quickSort(arr, 0, arr.length -1);
        for (int i = 0; i < num; i++) {
            list.add(arr[i]);
        }
        return list;
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }


    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(final String[] args) {
        int[] arr = {5, 3, 6, 2, 1};
        long startTime = System.nanoTime();

        System.out.println(findMinValue(arr, 2));

        long endTime = System.nanoTime();

        System.out.println(endTime - startTime);
    }
}
