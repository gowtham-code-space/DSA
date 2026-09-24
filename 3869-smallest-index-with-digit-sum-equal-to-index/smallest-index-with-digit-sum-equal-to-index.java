class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            int curr = nums[i];
            int dSum = 0;
            while(curr != 0){
                dSum += curr % 10;
                curr /= 10;
            }
            if(dSum == i) return i;
        }
        return -1;
    }
}