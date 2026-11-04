class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        String ans = new String();

        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                String curr = s.substring(i,j+1);
                if(isPalindrome(curr) && curr.length() > ans.length()){
                 ans = curr;   
                }
            }
        }
        return ans;
    }
    public boolean isPalindrome(String str){
        int l = 0;
        int r = str.length()-1;
        while(l<=r){
            if(str.charAt(l) != str.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}