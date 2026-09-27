class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        boolean ans = false;
        for(int i=0; i<n; i++){
            int val = Arrays.binarySearch(matrix[i],target);
            if(val >= 0) ans = true;
        }

        return ans;
    }
}