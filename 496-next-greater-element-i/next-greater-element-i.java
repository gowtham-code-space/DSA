class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        int n1 = nums1.length;
        int n2 = nums2.length;
        for(int num : nums2){
            while(!stack.isEmpty() && stack.peek() < num){
                map.put(stack.peek(), num);
                stack.pop();
            }
            stack.push(num);
        }
        int[] ans = new int[n1];
        for(int i=0; i<n1; i++){
            ans[i] = map.getOrDefault(nums1[i],-1);
        }
        return ans;
    }
}