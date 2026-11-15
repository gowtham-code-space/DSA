class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> subSet = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
       dfs(0 , nums);
       return res; 
    }

    public void dfs(int idx, int[] nums){
        int n = nums.length;
        if(idx > n-1){
            res.add(new ArrayList<>(subSet));
            return;
        }
        
        subSet.add(nums[idx]);
        dfs(idx+1, nums);

        subSet.remove(subSet.size()-1);
        dfs(idx+1, nums);

    }
}