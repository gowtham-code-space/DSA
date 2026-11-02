class Solution {
    public int sumSubarrayMins(int[] arr) {
        ArrayList<Integer> pse = prevSmallerEqual(arr);
        ArrayList<Integer> ns = nextSmallerEle(arr);

        int n = arr.length;
        long MOD = 1000000007;
        int res = 0;
        for(int i=0; i<n; i++){
            long curr = (long) arr[i] * (i - pse.get(i)) * (ns.get(i) - i);
            res = (int) ((res + curr) % MOD);
        }
        return res;
    }

    public ArrayList<Integer> prevSmallerEqual(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();
        
        int n = arr.length;
        res.add(-1);
        for(int i=0; i<n; i++){
            if(!stack.isEmpty()){
                if(arr[stack.peek()] < arr[i]){
                    res.add(stack.peek());
                }
                else{
                    while(!stack.isEmpty() && arr[stack.peek()] > arr[i]){
                        stack.pop();
                    }
                    if(stack.isEmpty()) res.add(-1);
                    else res.add(stack.peek());
                    
                }
            }
            stack.push(i);
        }
        return res;
    }

    public ArrayList<Integer> nextSmallerEle(int[] arr){
            int n = arr.length;
            Stack<Integer> stack = new Stack<>();
            ArrayList<Integer> res = new ArrayList<>();

            res.add(n);
            for(int i=n-1; i>=0; i--){
                if(!stack.isEmpty()){
                    if(arr[stack.peek()] < arr[i]){
                        res.add(stack.peek());
                    }
                    else{
                        while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]){
                            stack.pop();
                        }
                        if(stack.isEmpty()) res.add(n);
                        else res.add(stack.peek());
                    }
                }
                stack.push(i);
            }
            Collections.reverse(res);
            return res;
    }
}