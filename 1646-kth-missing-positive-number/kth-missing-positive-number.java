class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        if((arr[n-1] - n) < k) return n+k;
        int lo = 0;
        int hi = n-1;
        while(lo<=hi){
            int mid = lo + (hi - lo)/2;
            if((arr[mid] - (mid+1)) >= k) hi = mid-1;
            else lo = mid+1;
        }
        if(hi == -1) return k;
        return arr[hi] + k - (arr[hi] - (hi+1));
    }
}