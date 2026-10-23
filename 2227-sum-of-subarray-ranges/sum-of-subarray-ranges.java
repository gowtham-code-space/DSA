class Solution {
    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        long ans = 0;
        for(int i=0; i<n; i++){
            long mini = Long.MAX_VALUE;
            long maxi = Long.MIN_VALUE;
            for(int j=i; j<n; j++){
                mini = Math.min(mini, nums[j]);
                maxi = Math.max(maxi, nums[j]);
                ans += (maxi - mini);
            }
            
        }
        return ans;
    }
}