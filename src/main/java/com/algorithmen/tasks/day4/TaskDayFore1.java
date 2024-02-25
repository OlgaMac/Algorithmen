package com.algorithmen.tasks.day4;

/**
 * Написать функцию heapify(arr);
 */
public class TaskDayFore1 {
    private static int total;

    private static void swap(int[] arr, int a, int b)
    {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    private static void heapify(int[] arr, int i)
    {
        int lft = 2 * i + 1;
        int rgt = 2 * i + 2;
        int grt = i;

        if (lft <= total && arr[lft] < arr[grt]){ grt = lft;}
        if (rgt <= total && arr[rgt] < arr[grt]){ grt = rgt;}
        if (grt != i) {
            swap(arr, i, grt);
            heapify(arr, grt);
        }
    }

    public static void sort(int[] arr)
    {
        int n = arr.length;
        total = n - 1;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, i);

        for (int i = total; i > 0; i--) {
            swap(arr, 0, i);
            total--;
            heapify(arr, 0);
        }
    }

    public static void main(final String[] args)
    {
        int[] arr = { 3, 2, 1, 5, 4 };

        System.out.println(java.util.Arrays.toString(arr));
        sort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }
}
