class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int idx = 0;
        int maxi = 0;
        for(int i=0; i<mat.length; i++){
            int cnt = 0;
            for(int j = 0; j < mat[0].length; j++){
                if(mat[i][j] == 1){
                    cnt++;
                    if(maxi < cnt){
                        idx = i;
                        maxi = cnt;
                    }
                }
            }
        }

        return new int[]{idx, maxi};
    }
}