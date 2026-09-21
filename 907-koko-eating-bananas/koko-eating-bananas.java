class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int lo = 1;
        int hi = 0;
        for(int num:piles) hi =  Math.max(hi,num);

        while(lo<=hi){
            int mid = lo + (hi - lo)/2;
            long sum = 0;
            for(int num : piles) sum += (num + mid-1)/mid;

            if(sum > h) lo = mid+1;
            else hi = mid-1;
        }
        return lo;
    }
}