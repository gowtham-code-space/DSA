class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int hi = n-1;
        int lo = 0;
        int ans = -1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            int ele = nums[mid];
            if(ele == target){
                ans = mid;
                break;
            }
            else if(nums[lo] <= nums[mid]){
                if(target >= nums[lo] && target < nums[mid]) hi = mid-1;
                else lo = mid+1;
            }
            else{
                if(target <= nums[hi] && target > ele) lo = mid+1;
                else hi = mid-1;
            }
        }
        return ans;
    }
}