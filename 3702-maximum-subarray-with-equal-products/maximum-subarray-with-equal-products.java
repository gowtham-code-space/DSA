class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length;
        int maxi = 0;
        for (int i = 0; i < n; i++) {
            long prod = 1;
            int high = 0;
            for (int j = i; j < n; j++) {
                prod *= nums[j];
                high = Math.max(high, nums[j]);
                
                int[] sub = Arrays.copyOfRange(nums, i, j + 1);
                int gcd = GCD(sub, high);
                long lcm = LCM(sub, high);
                
                if (prod == gcd * lcm) {
                    maxi = Math.max(maxi, j - i + 1);
                }
                //if (prod > 1000000000L) break; // Stop if product gets way too big
            }
        }
        return maxi;
    }

    public int GCD(int[] arr, int high) {
        int n = arr.length;
        for (int i = high; i >= 1; i--) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] % i == 0) cnt++;
            }
            if (cnt == n) return i;
        }
        return 1;
    }

    public long LCM(int[] arr, int high) {
        long lcm = high;
        while (true) {
            boolean allDivisible = true;
            for (int num : arr) {
                if (lcm % num != 0) {
                    allDivisible = false;
                    break;
                }
            }
            if (allDivisible) return lcm;
            lcm += high;
        }
    }
}
