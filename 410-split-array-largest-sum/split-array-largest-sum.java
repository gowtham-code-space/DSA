class Solution {
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int lo = 0;
        int hi = 0;
        for(int num : nums){
            lo = Math.max(num,lo);
            hi += num;
        }

        while(lo<=hi){
            int mid = lo + (hi - lo)/2;
            if(fn(nums, k, mid)) hi = mid-1;
            else lo = mid+1;
        }
        return lo;
    }

    public boolean fn(int[] nums, int k, int limit){
        int split = 1;
        int total = 0;
        for(int i=0;i<nums.length;i++){
            if(total+nums[i] <= limit){
                total += nums[i];
            }
            else{
                total = nums[i];
                split++;
            };
        }
        return split <= k;
    }
}