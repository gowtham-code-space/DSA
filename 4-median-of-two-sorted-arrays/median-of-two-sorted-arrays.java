class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int b = n + m;
        int[] both = new int[b];
        int i = 0;
        
        for(int num : nums1) both[i++] = num;
        i = n;
        for(int num : nums2) both[i++] = num;
        Arrays.sort(both);

        int mid = (b-1)/2;
        if(b % 2 != 0){
            return (double) both[mid];
        }
        else{
            int mid2 = mid+1;
            return (both[mid] + both[mid2])/2.0;
        }
    }
}