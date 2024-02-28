package com.algorithmen.tasks.day4;

import java.util.ArrayList;
import java.util.List;

import static com.algorithmen.tasks.day4.TaskDayFore3.Heapify.sort;

/**
 * Дан массив целых чисел. Требуется найти k-минимальных элементов;
 */
public class TaskDayFore3 {
    static List<Integer> findMinValue(int arr[], int num) {
        List<Integer> list = new ArrayList<>();
        sort(arr);
        for (int i = 0; i < num; i++) {
            list.add(arr[i]);
        }
        return list;
    }

    class Heapify {
        private static int total;

        public static void sort(int[] arr) {
            int n = arr.length;
            total = n - 1;

            for (int i = n / 2 - 1; i >= 0; i--)
                heapifyMin(arr, i);

            for (int i = total; i > 0; i--) {
                swap(arr, 0, i);
                total--;
                heapifyMin(arr, 0);
            }
        }

        private static void swap(int[] arr, int a, int b) {
            int tmp = arr[a];
            arr[a] = arr[b];
            arr[b] = tmp;
        }

        private static void heapifyMin(int[] arr, int i) {

            int lft = 2 * i + 1;
            int rgt = 2 * i + 2;
            int grt = i;

            if (lft <= total && arr[lft] > arr[grt]) {
                grt = lft;
            }
            if (rgt <= total && arr[rgt] > arr[grt]) {
                grt = rgt;
            }
            if (grt != i) {
                swap(arr, i, grt);
                heapifyMin(arr, grt);
            }
        }
    }


    public static void main(final String[] args) {
        int[] arr = {5, 3, 6, 2, 1};

        long startTime = System.nanoTime();

        System.out.println(findMinValue(arr, 2));

        long endTime = System.nanoTime();

        System.out.println(endTime - startTime);
    }
}
