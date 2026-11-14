class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int res = Integer.MAX_VALUE;
        int n = nums.size();
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){
                int currLen = j-i+1;
                sum += nums.get(j);

                if(currLen >= l && currLen <= r){
                    if(sum > 0)
                        res = Math.min(res, sum);
                }
                else if(currLen > l && currLen > r) break;
                
            }
        }

        return res == Integer.MAX_VALUE ? -1 : res;
    }
}