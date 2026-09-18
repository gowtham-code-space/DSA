class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int lo = 1;
        int hi = n-2;
        int ans = 0;
        if(n == 1) return 0;
        if(nums[0] > nums[1]) return 0;
        if(nums[n-1] > nums[n-2]) return n-1;

        while(lo<=hi){
            int mid = lo + (hi - lo)/2;
            if(nums[mid-1] < nums[mid] && nums[mid] > nums[mid+1]){
                return mid;
            }
            else if(nums[mid] < nums[mid-1]) hi = mid-1;
            else lo = mid +1;
            
        }
        return -1;
    }
    int bs(int[] nums, int lo, int hi, int isLeft){
        int ans;
        if(isLeft == 1) ans = lo;
        else ans = hi;

        while(lo<hi){
            int mid = lo + (hi - lo)/2;
            if(nums[mid-1] < nums[mid] && nums[mid] > nums[mid+1]){
                ans = mid;
                break;
            }
            else if(isLeft == 1) hi = mid-1;
            else lo = mid+1;
        }
        return ans;
    }
}