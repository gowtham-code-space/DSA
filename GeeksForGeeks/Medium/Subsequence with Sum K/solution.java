class Solution {
    Boolean[][] dp;

    public boolean checkSubsequenceSum(int[] arr, int k) {
        int n = arr.length;
        dp = new Boolean[n][k + 1];

        return check(arr, k, 0, 0);
    }

    boolean check(int[] arr, int k, int i, int sum) {

        if (sum == k) return true;
        if (i == arr.length || sum > k) return false;

        if (dp[i][sum] != null) return dp[i][sum];

        boolean take = check(arr, k, i + 1, sum + arr[i]);
        boolean noTake = check(arr, k, i + 1, sum);

        return dp[i][sum] = take || noTake;
    }
}