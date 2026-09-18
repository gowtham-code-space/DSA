class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int lo = 0;
        int hi = n-1;
        int mini = Integer.MAX_VALUE;
        while(lo<=hi){
            int mid = lo + (hi - lo)/2;
            mini = Math.min(mini,nums[mid]);
            if(nums[mid] >= nums[hi]){
                lo = mid +1;
                mini = Math.min(mini, nums[hi]);
            }
            else{
                hi = mid-1;
                mini = Math.min(mini,nums[lo]);
            }

        }
        return mini;
    }
}