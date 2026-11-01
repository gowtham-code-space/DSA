class Solution {
    public int minMoves(int[] nums) {
        int mini = Integer.MAX_VALUE;
        int cnt = 0, res = 0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(mini == nums[i]) cnt++;
            mini = Math.min(mini, nums[i]);
        }

        if(cnt == n) return res;

        for(int num : nums){
            res += (num - mini);
        }
        return res;
    }
}