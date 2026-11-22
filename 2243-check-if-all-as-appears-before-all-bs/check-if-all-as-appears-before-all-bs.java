class Solution {
    public boolean checkString(String s) {
        boolean hasB = false;
        for(int i=0; i < s.length(); i++){
            char chr = s.charAt(i);
            if(chr == 'b') hasB = true;
            else if(chr == 'a' && hasB) return false;
        }
        return true;
    }
}