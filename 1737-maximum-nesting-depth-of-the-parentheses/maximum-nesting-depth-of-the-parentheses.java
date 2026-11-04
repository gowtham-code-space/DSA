class Solution {
    public int maxDepth(String s) {
        int open = 0;
        int close = 0;
        int n = s.length();
        int res = 0;
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(ch == '(') open++;
            else if(ch == ')') close++;
            res = Math.max(res, Math.abs(open - close));
        }
        return res;
    }
}