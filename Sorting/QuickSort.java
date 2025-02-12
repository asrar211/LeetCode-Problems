package Sorting;

import java.util.List;

public class QuickSort {

    static int partition(List<Integer> arr, int low, int high){
        int pivot = arr.get(low);
        int i= low;
        int j= high;

        while(i<j){
            while(arr.get(i) <= pivot && i <= high -1){
                i++;
            }
            while(arr.get(j) > pivot && j >= low + 1){
                j--;
            }
            if(i<j){
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }
        int temp = arr.get(low);
        arr.set(low, arr.get(j));
        arr.set(j, temp);
        return j;
    }

    static void qs(List<Integer> arr, int low, int high) {
        if(low < high){
            int PIndex = partition(arr, low, high);
            qs(arr, low, PIndex - 1);
            qs(arr, PIndex + 1, high);
        }
    }
}
