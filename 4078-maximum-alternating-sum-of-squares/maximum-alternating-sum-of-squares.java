class Solution {
    public long maxAlternatingSum(int[] nums) {
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        int n = nums.length;
        for(int i=0; i<n; i++){
            int sq = nums[i] * nums[i];
            if(i % 2 == 0) even.add(sq);
            else odd.add(sq);
        }
        Collections.sort(even);
        Collections.sort(odd, Collections.reverseOrder());

        int oddLen = odd.size();
        int evenLen = even.size();
        int i = 0;

        while(i<oddLen && i<evenLen){
            int currOdd = odd.get(i);
            int currEven = even.get(i);
            if(currOdd > currEven){
                even.set(i, currOdd);
                odd.set(i, currEven);
            }
            i++;
        }

        long ans = 0;
        for(i=0; i<evenLen; i++){
            ans += even.get(i);
        }

        for(int j=0; j<oddLen; j++){
            ans -= odd.get(j);
        }
        return ans;
    }
}