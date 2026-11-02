class Solution {
    public int minMoves2(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int target = nums[(n-1) /2];
        int res = 0;
        for(int i=0; i<n; i++){
            int curr = nums[i];
            res += Math.abs(curr - target);
        }
        return res;
    }
}