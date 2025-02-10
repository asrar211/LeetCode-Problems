package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public int[] bubbleSort(int[] arr, int n){
        for(int i= n-1; i>=1; i--){
            for(int j=0; j<= i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
            return arr; 
    }
    public static void main(String[] args) {
        int arr[] = {12, 34, 54, 6, 7, 98};
        int n = arr.length;

        BubbleSort sort = new BubbleSort();
        int res[] = sort.bubbleSort(arr, n);

        System.out.println("Sorted Array: " + Arrays.toString(res));
    }
}
