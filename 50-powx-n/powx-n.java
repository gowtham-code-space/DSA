class Solution {
    public double myPow(double x, int n) {
        long abs = Math.abs(n);
        double res = pow(x, abs);
        return n  < 0 ? (1/res) : res;
    }
    public double pow(double x, long y){
        double temp;
        if(y == 0) return 1;
        temp = pow(x , y/2);
        if(y % 2 == 0) return temp * temp;
        else return temp * temp * x;
    }
}