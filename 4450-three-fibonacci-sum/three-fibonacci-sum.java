class Solution {
    public boolean threeFibonacciSum(int n) {
        int a=0;
        int b=1;
        if( n%2 != 0 || n<0) return false;
        n = n/2;
        while(a < n){
            int c = a + b;
            a = b;
            b = c;
        }
        return a == n;
    }
}