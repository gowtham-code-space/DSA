class Solution {
    public int minimizeSum(int[] nums) {
       int n = nums.length;
       Arrays.sort(nums);
       int comb1 = nums[n-1] - nums[2];
       int comb2 = nums[n-2] - nums[1];
       int comb3 = nums[n-3] - nums[0];
       return Math.min(Math.min(comb1,comb2) , comb3);
    }
}