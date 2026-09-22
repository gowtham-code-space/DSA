class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if(n < m*k) return -1;
        int lo=1;
        int hi =0;
        for( int b : bloomDay) hi = Math.max(hi, b);

        int res = -1;
        while(lo<=hi){
            int mid = lo + (hi - lo)/2;
            if(fn(mid, bloomDay, m,k) == true){
                res = mid;
                hi = mid-1;
            }
            else lo = mid+1;
        }
        return res;
    }
    public boolean fn(int currDay , int[] arr, int m,  int k){
        int t = 0;
        int cnt = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] <= currDay) t++;
            else{
                cnt += t/k;
                t = 0;
            }
        }
        cnt += t/k;
        t = 0;
        if(cnt>=m) return true;
        return false;
    }
}