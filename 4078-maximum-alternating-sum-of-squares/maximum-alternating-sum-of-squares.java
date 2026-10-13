class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n; i++){
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        int k = n/2;
        long ans = 0;

        for(int i=0; i<k;i++) ans-= nums[i];
        for(int i=k; i<n; i++) ans += nums[i];
        return ans;
    }
}