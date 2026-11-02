class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder stack = new StringBuilder();
        int n = num.length();
        for(int i=0; i<n; i++){
            char curr = num.charAt(i);
                while(stack.length() != 0 && stack.charAt(stack.length()-1) > curr && k > 0){
                    stack.deleteCharAt(stack.length()-1);
                    k--;
                }
            stack.append(curr);
        }
        while(!stack.isEmpty() && k > 0){
            stack.deleteCharAt(stack.length()-1);
            k--;
        }

        int i = 0;
        while (i < stack.length() && stack.charAt(i) == '0') {
            i++;
        }

        String res = stack.substring(i);
        return res.isEmpty() ? "0" : res;
    }
}