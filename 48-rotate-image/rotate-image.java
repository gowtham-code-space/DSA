class Solution {
    public void rotate(int[][] mat) {
        int n = mat.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        rev(mat);


    }
    public void rev(int[][] mat){
        int n = mat.length;

        for(int i=0;i<n;i++){
            int l=0;
            int r=n-1;
            while(l<=r){
                int temp = mat[i][r];
                mat[i][r] = mat[i][l];
                mat[i][l] = temp;
                l++;
                r--;
            }
        }
    }
}