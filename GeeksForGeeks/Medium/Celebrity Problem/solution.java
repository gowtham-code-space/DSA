class Solution {
    public int celebrity(int mat[][]) {
        // code here
        int n = mat.length;
        int[] freq = new int[n];
        
        if(n == 1) return 0;
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i == j) continue;
                if(mat[i][j] == 1) freq[j]++;
            }
        }
        
        for(int i = 0; i < n; i++) {
                    if(freq[i] == n - 1) {
                        boolean knowsNobody = true;
        
                        for(int j = 0; j < n; j++) {
                            if(i != j && mat[i][j] == 1) {
                                knowsNobody = false;
                                break;
                            }
                        }
        
                        if(knowsNobody) return i;
                    }
                }
        
                return -1;
        
    }
}