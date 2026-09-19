class Solution {
    public int countSpecialIntegers(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(i == 0 || nums[i] != nums[i-1]){
                map.put(nums[i], map.getOrDefault(nums[i],0) +1);
            }
        }
        int cnt = 0;

        for(int val : map.values()){
            if(val == 1) cnt++;
        }
        return cnt;
    }
}