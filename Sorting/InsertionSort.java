package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public int[] insertionSort(int[] arr, int n){
        for(int i=0; i<= n-1; i++){
            int j=i;
            while(j>0 && arr[j-1] > arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {12, 34, 54, 6, 7, 98};
        int n = arr.length;

        InsertionSort sort = new InsertionSort();
        int res[] = sort.insertionSort(arr, n);

        System.out.println("Sorted Array: " + Arrays.toString(res));
    }
}
