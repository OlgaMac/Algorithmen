package com.algorithmen.tasks.day4;

/**
 * Дан массив целых чисел. Требуется найти k-минимальных элементов;
 */
public class TaskDayFore3Solusion2 {
    static int findMinValue(int arr[], int k) {
        return kthSmallest(arr, 0, arr.length -1, k);
    }
    private static int kthSmallest(int[] arr, int low, int high, int k) {
        int pi = partition(arr, low, high);
        if(pi == k){
            return arr[k];
        }else if(pi < k) {
            return kthSmallest(arr, pi + 1, high, k);
        }else if(pi > k) {
            return kthSmallest(arr, low, pi - 1, k);
        }
        return -1;
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

        System.out.println(findMinValue(arr, 1));

        long endTime = System.nanoTime();

        System.out.println(endTime - startTime);
    }

}
