class Solution {
    public int fib(int n) {
        int a = 0, b = 1;
        int res = 0;
        while(n-->=0){
            res += a;
            int temp = a;
            a = b;
            b = res;
        }
        return res;
    }
}