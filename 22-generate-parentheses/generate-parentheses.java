class Solution {
    
    List<String> res = new ArrayList<>();
    StringBuilder curr = new StringBuilder();

    public List<String> generateParenthesis(int n) {
        rec( 0 , 0, n);
        return res;
    }

    public void rec(int open, int close, int n){
        if(open == close && open == n){
            res.add(curr.toString());
            return;
        }
        if(open < n){
            curr.append('(');
            rec(open+1, close, n);
            curr.deleteCharAt(curr.length()-1);
        }
        if (open > close){
            curr.append(')');
            rec(open, close+1, n);
            curr.deleteCharAt(curr.length()-1);
        }
    }
}