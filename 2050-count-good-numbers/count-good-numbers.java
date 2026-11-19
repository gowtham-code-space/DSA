class Solution {
    int MOD = (int)1e9+7;
    public int countGoodNumbers(long n) {
        long first = (n % 2 == 0 ? n /2 : (n/2) +1);
        long second = n/2;

        long mul1 = (long) pow(5,first) % MOD;
        long mul2 = (long) pow(4,second) % MOD;

        long ans = 1;
        ans = (ans * mul1) % MOD;
        ans = (mul2!=0 ? ans * mul2 : ans);
        return (int)(ans % MOD);
    }

    public long pow(long x, long y){
        long temp;
        if(y == 0) return 1;
        temp = pow(x, y/2);
        if(y % 2 == 0) return (temp * temp) % MOD;
        else return (temp * temp * x) % MOD;
    }
}