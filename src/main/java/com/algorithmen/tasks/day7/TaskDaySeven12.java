package com.algorithmen.tasks.day7;

/**
 * Дан массив неповторяющихся чисел, который был отсортирован, а затем циклически сдвинут на
 * неизвестное число позиций.
 */
public class TaskDaySeven12 {

    public static int fidShift(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int next = (mid + 1) % arr.length;
            int prev = (mid + arr.length - 1) % arr.length;

            if (arr[mid] <= arr[next] && arr[mid] <= arr[prev]) {
                return mid;
            }

            if (arr[mid] <= arr[high]) {
                high = mid - 1;
            } else if (arr[mid] >= arr[low]) {
                low = mid + 1;
            }
        }

        return -1;
    }

    public static void main(final String[] args) {
        int[] expected = {4, 5, 6, 7, 1, 2, 3};

        System.out.println(fidShift(expected));

    }
}
