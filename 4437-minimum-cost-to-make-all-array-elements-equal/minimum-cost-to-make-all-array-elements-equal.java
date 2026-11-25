class Solution {
    public long minCost(int[] nums) {
        long ans = Long.MAX_VALUE;
        int n = nums.length;

        int i = 0;
        while(i<n){
            int j = i;
            while(j+1 < n && nums[j] == nums[j+1]){
                j++;
            }
            if(i<n-1 && j>0){
                long cost = (long)(i+n-j-1)*nums[i];
                ans = Math.min(ans, cost);
            }
            i = j+1;
        }
        return ans;
    }
}