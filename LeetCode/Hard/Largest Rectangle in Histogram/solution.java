class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int res = 0;
        int[] pse = new int[n];
        int[] nse = new int[n];

        nextSmallerEle(heights, nse);
        prevSmallerEle(heights, pse);

        for(int i=0; i<n; i++){
            int curr = heights[i] * (nse[i] - pse[i] -1);
            res = Math.max(res, curr);
        }
        return res;
    }
    public void nextSmallerEle(int[] heights, int[] nse){
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();

        for(int i=n-1; i>=0; i--){
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                stack.pop();
            }
            nse[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }
    }

    public void prevSmallerEle(int[] heights, int[] nse){
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<n; i++){
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                stack.pop();
            }
            nse[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
    }
}