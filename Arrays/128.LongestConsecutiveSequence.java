class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        int longest =0;
        Set<Integer> set = new HashSet<>();

        for(int i=0; i< n; i++){
            set.add(nums[i]);
        }
        for(int it: set){
            if(!set.contains(it -1)){
                int cnt = 1;
                int x = it;
                while(set.contains(x+1)){
                    x = x+1;
                    cnt = cnt+1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }
}