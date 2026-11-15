class Solution {
    List<String> res = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    
    public List<String> powerSet(String s) {
        // Code here
        dfs(0, s);
        Collections.sort(res);
        return res;
    }
    
    public void dfs(int idx, String str){
        if(idx > str.length()-1){
            res.add(new StringBuilder(sb).toString());
            return;
        }
        
        sb.append(str.charAt(idx));
        dfs(idx+1, str);
        
        sb.deleteCharAt(sb.length()-1);
        dfs(idx+1, str);
    }
}