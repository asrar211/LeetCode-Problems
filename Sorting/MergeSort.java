class Solution {
    public int[] sortArray(int[] nums) {
        if (nums.length <= 1) return nums; 
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void mergeSort(int[] arr, int low, int high){
        if(low >= high) return;

        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }

    private void merge(int[] arr, int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left <= mid){
            temp.add(arr[left]);
                left++;
        }

        while(right <= high){
            temp.add(arr[right]);
                right++;
        }

        for(int i=low; i<=high; i++){
            arr[i] = temp.get(i-low);
        }
    }
}