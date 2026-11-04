class Solution {
    public int myAtoi(String s) {
        long res = 0;
        boolean hasNeg = false;
        boolean hasSign = false;
        boolean hasNum = false;

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch == ' ' && !hasSign && !hasNum) {
                continue;
            }
            else if((ch == '-' || ch == '+') && !hasSign && !hasNum) {
                hasNeg = (ch == '-');
                hasSign = true;
            }
            else if(ch >= '0' && ch <= '9') {
                hasNum = true;
                res = res * 10 + (ch - '0');

                if(hasNeg && res > 2147483648L) {
                    return Integer.MIN_VALUE;
                }

                if(!hasNeg && res > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
            }
            else {
                break;
            }
        }

        return hasNeg ? (int)-res : (int)res;
    }
}