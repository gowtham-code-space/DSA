class Solution {
    public int minMoves(int[] nums) {
        int maxi = 1;
        int n = nums.length;
        int res = 0;
        for(int i=0; i<n; i++){
            maxi =Math.max(maxi, nums[i]);
        }

        for(int i=0; i<n; i++){
            res += (maxi - nums[i]);
        }
        return res;
    }
}