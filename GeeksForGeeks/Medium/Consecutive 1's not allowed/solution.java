class Solution {
    int[][] dp;
    
    int countStrings(int n) {
        // Code here'
        dp = new int[n][2];
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }
        
        int cnt = dfs(0,0,n);
        
        return cnt;
    }

    public int dfs(int idx,int prev, int n){
        if(idx > n-1){
            return 1;
        }
        
        if(dp[idx][prev] != -1) return dp[idx][prev];
        
        int zero = dfs(idx+1, 0, n);
        int one = 0;
        
        if (prev == 0) {
            one = dfs(idx + 1, 1, n);
        }
        
        return dp[idx][prev] = one + zero;
    }
}
