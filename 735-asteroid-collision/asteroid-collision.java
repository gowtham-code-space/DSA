class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int a: asteroids){
            if(a > 0) stack.push(a);
            else{
                while(!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(a)){
                    stack.pop();
                }
                if(!stack.isEmpty() && stack.peek() > 0 && stack.peek() == Math.abs(a)){
                    stack.pop();
                }
                else if(stack.isEmpty()){
                    stack.push(a);
                }
                else if(!stack.isEmpty() && stack.peek() < 0){
                    stack.push(a);
                }
            }
        }
        int n = stack.size();
        int[] ans = new int[n];

        for(int i=n-1; i>=0; i--){
            ans[i] = stack.pop();
        }
        return ans;
    }
}