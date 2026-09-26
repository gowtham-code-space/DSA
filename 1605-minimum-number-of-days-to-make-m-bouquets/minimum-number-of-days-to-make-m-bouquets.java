class Solution {
    public boolean fn(int[] arr , int limit, int m, int k){
        int cnt = 0, total = 0, adj = 0;
        for(int i=0; i< arr.length;i++){
            if(arr[i] <= limit){
                adj++;
                if(adj == k){
                    cnt++;
                    adj = 0;
                }
            }
            else{
                adj=0;
            }
        }
        return cnt >= m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        int lo = 1, hi = 0, res = -1;
        for(int i=0;i<n;i++){
            hi = Math.max(hi , bloomDay[i]);
        }

        while(lo <= hi){
            int mid = lo + (hi - lo)/2;
            if(fn(bloomDay, mid, m, k)){
                res = mid;
                hi = mid-1;
            }
            else lo = mid + 1;
        }
        return res;
    }
}