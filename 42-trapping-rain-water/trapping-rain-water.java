class Solution {
    public int trap(int[] h) {
        int n = h.length;
        int res = 0;
        int[] lMax = new int[n];
        int[] rMax = new int[n];

        lMax[0] = h[0];
        for(int i=1; i<n; i++){
            lMax[i] = Math.max(h[i], lMax[i-1]);
        }

        rMax[n-1] = h[n-1];
        for(int i=n-2; i>=0; i--){
            rMax[i] = Math.max(h[i], rMax[i+1]);
        }

        for(int i=0; i<n; i++){
            int limit = Math.min(lMax[i], rMax[i]);
            res += (limit-h[i]);
        }
        return res;
    }
}