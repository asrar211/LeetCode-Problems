package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public int[] selectionSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int mini = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mini];
            arr[mini] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {12, 34, 54, 6, 7, 98};
        int n = arr.length;

        SelectionSort sort = new SelectionSort();
        int res[] = sort.selectionSort(arr, n);

        System.out.println("Sorted Array: " + Arrays.toString(res));
    }
}
