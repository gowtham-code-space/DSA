class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int n: nums2){
            while(!stack.isEmpty() && stack.peek() < n){
                map.put(stack.peek(), n);
                stack.pop();
            }
            stack.push(n);
        }

        int[] ans = new int[nums1.length];
        for(int i=0; i<nums1.length; i++){
            ans[i] = map.getOrDefault(nums1[i] , -1);
        }
        return ans;
    }
}