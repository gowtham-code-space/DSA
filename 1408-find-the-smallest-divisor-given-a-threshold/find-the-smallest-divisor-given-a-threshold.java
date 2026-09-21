class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int lo = 1;
        int hi = 0;
        for (int num : nums) hi = Math.max(hi,num);
        while(lo<=hi){
            int mid = lo + (hi - lo)/2;
            int sum = 0;
            for(int num : nums) sum += (num + mid-1)/mid;
            if(sum > threshold) lo = mid + 1;
            else hi = mid - 1;
        }
        return lo;
    }
}