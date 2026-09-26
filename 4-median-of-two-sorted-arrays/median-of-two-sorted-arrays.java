class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int a = n + m;
        int [] ans = new int[a];
        int pt1 = 0, pt2 = 0;

        for(int i=0; i< (n + m); i++){
            if(pt1>=n){
                ans[i] = nums2[pt2];
                pt2++;
                continue;
            }
            else if(pt2 >= m){
                ans[i] = nums1[pt1];
                pt1++;
                continue;
            }

            else if(nums1[pt1] >= nums2[pt2]){
                ans[i] = nums2[pt2];
                pt2++;
            }
            else{
                ans[i] = nums1[pt1];
                pt1++;
            }
        }
        int mid = (a / 2);
        if(a % 2 != 0){
            return (long) ans[mid];
        }
        return (ans[mid] + ans[mid-1]) / 2.0;
    }
}