
class Solution {

    static int perfectSum(int[] arr, int target) {
        int n = arr.length;

        int[][] dp = new int[n][target + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return count(arr, target, 0, dp);
    }

    static int count(int[] arr, int target, int i, int[][] dp) {

        if (i == arr.length) {
            return target == 0 ? 1 : 0;
        }

        if (dp[i][target] != -1) {
            return dp[i][target];
        }

        int take = 0;

        if (arr[i] <= target) {
            take = count(arr, target - arr[i], i + 1, dp);
        }

        int noTake = count(arr, target, i + 1, dp);

        return dp[i][target] = take + noTake;
    }
}
