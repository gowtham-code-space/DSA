class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int cnt = 0;
        int[] res = new int[n-k+1];
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> nums[b] - nums[a]);

        for(int i=0; i<n; i++){
            maxHeap.add(i);

            while(maxHeap.peek() <= i-k){
                maxHeap.poll();
            }
            if(i >= k-1){
                res[i-k+1] = nums[maxHeap.peek()];
            }
        }

        return res;
    }
}