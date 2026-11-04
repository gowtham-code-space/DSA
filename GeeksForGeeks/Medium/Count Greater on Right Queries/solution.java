class Solution {
    int[] countGreater(int arr[], int indices[]) {
        // code here
        int n = indices.length;
        int res[] = new int[n];
        for(int i=0; i<n; i++){
            int curr = indices[i];
            int cnt = 0;
            for(int j=indices[i]; j<arr.length; j++){
                if(arr[curr] < arr[j]){
                    cnt++;
                }
            }
            res[i] = cnt;
        }
        return res;
    }
}
