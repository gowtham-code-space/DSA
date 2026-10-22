class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
            int idx=1;
            ans[i] = -1;
            while(idx < n){
                if(nums[i] < nums[(i + idx) % n]){
                    ans[i] = nums[(i + idx) % n];
                    break;
                }
                idx++;
            }
        }
        return ans;
    }
}