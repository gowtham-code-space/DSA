class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int x=-1,y=-1;
        int maxi = -1;
        for(int i = 0; i<n ; i++){
            for(int j = 0; j<m; j++){
                if(mat[i][j] > maxi){
                    x = i;
                    y = j;
                    maxi = mat[i][j];
                }
            }
        }
        return new int[]{x,y};
    }
}