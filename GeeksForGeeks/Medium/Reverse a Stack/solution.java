class Solution {
    public static void reverseStack(Stack<Integer> st) {
        // code here
        int n = st.size();
        int[] temp = new int[n];
        int pt=0;
        
        while(!st.isEmpty()){
            temp[pt++] = st.pop();
        }
        
        for(int i=0; i<n; i++){
            st.push(temp[i]);
        }
    }
}
