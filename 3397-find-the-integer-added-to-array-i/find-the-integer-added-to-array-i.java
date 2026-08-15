class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int min1=0;
        int min2=0;

        for(int i=0;i<nums1.length;i++){
            min1=Math.max(min1,nums1[i]);
            min2=Math.max(min2,nums2[i]);

        }
        return min2-min1;
    }
}