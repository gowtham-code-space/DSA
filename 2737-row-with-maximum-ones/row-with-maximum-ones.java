class Solution {
    public int bs(int[] arr, int lo, int hi, boolean isLeft){
        int res = -1;
        while(lo <= hi){
            int mid = lo + (hi - lo)/2;
            int val = arr[mid];
            if(val == 1){
                res = mid;
                if(isLeft) hi = mid - 1;
                else lo = mid + 1;
            }
            else if(val < 1) lo = mid + 1;
            else hi = mid -1;
        }
        return res;
    }
    public int[] rowAndMaximumOnes(int[][] mat) {
        int idx = 0;
        int cnt = 0;
        int n = mat.length;
        int m = mat[0].length;

        for(int i=0; i<n; i++){
            int lo = 0;
            int hi = m-1;
            Arrays.sort(mat[i]);
            while(lo <= hi){
                int mid = lo + (hi - lo)/2;
                int val = mat[i][mid];
                if(val == 1){
                    int start = bs(mat[i], 0, mid , true);
                    int end = bs(mat[i], mid, m-1, false);

                    int length = (end - start + 1);

                    if(length > cnt){
                        idx = i;
                        cnt = length;
                    }
                    break;
                }
                else if(val < 1) lo = mid + 1;
                else hi = mid - 1;
            }
        }
        return new int[]{idx, cnt};
    }
}