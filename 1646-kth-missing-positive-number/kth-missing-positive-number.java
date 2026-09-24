class Solution {
    public int fn(int i, int f){
        return i-f;
    }
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int lo = 0;
        int hi = n;

        if(arr[n-1] - n < k) return n+k;
        while(lo<=hi){
            int mid = lo + (hi - lo)/2;
            if(fn(arr[mid] , (mid+1)) >= k) hi = mid-1;
            else lo = mid+1;
        }
        if(hi == -1) return k;
        return arr[hi] + k-fn(arr[hi], (hi+1));
    }
}