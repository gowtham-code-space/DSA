class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int lo = 1;
        int hi = 0;
        int ans = 1;
        for (int w:weights) hi += w;
        while(lo<=hi){
            int mid = lo + (hi - lo)/2;
            if(fn(mid ,weights,days) == true){
                hi = mid-1;
                ans = mid;
            }
            else lo = mid+1;
        }
        return ans;
    }
    public boolean fn(int capacity, int[] weights, int days){
        int cnt = 1;
        int total = 0;
        for(int w : weights){
            if (w > capacity) return false;
            if(total+w > capacity){
                cnt++;
                total = w;
            }
            else total += w;
        }
        return cnt <= days;
    }
}