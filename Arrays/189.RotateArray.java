class Solution {
    public void reverse(int[] arr, int a, int b) {
        while (a < b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;

            a++;
            b--;
        }
    }

    public void rotate(int[] nums, int k) {
        int size = nums.length;
        k = k % size;
        reverse(nums, 0, size - k - 1);
        reverse(nums, size - k, size - 1);
        reverse(nums, 0, size - 1);
    }
}