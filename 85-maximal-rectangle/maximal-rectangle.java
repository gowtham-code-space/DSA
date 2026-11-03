class Solution {
    public int maximalRectangle(char[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int res = 0;

        int[] pse = new int[col];
        int[] nse = new int[col];

        for(int i=0; i<row; i++){
            int[] processed = process(matrix, i);
            prevSmallerEle(processed, pse);
            nextSmallerEle(processed, nse);

            for(int j=0; j<col; j++){
                int curr = processed[j] * (nse[j] - pse[j] -1);
                res = Math.max(res, curr);
            }
            
        }

        return res;
    }

    public int[] process(char[][] matrix, int currRow){
        int col = matrix[0].length;
        int[] processed = new int[col];

        for(int j = 0; j < col; j++){
            int curr = 0;
            for(int i=currRow; i>=0; i--){
                if(matrix[i][j] == '0') break;
                else{
                    curr += 1;
                }
            }
            processed[j] = curr;
        }
        return processed;
    }

    public void prevSmallerEle(int[] processed, int[] pse){
        int n = processed.length;
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<n; i++){
            while(!stack.isEmpty() && processed[stack.peek()] >= processed[i]){
                stack.pop();
            }
            pse[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
    }

    public void nextSmallerEle(int[] processed, int[] nse){
        int n = processed.length;
        Stack<Integer> stack = new Stack<>();
        
        for(int i=n-1; i>=0; i--){
            while(!stack.isEmpty() && processed[stack.peek()] >= processed[i]){
                stack.pop();
            }
            nse[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }
    }

}