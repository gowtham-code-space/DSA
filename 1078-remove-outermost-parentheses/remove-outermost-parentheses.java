class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();
        int level = 0;
        StringBuilder sb = new StringBuilder(); 
        for(int i=0;i<n;i++){
            char curr = s.charAt(i);
            if(curr == ')') level--;
            if(level>0) sb.append(curr);
            if(curr == '(') level++;

        }
        return sb.toString();
    }
}