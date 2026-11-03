import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n = nums1.length + nums2.length;
        int[] nums = new int[n];

        int k = 0;

        for (int i : nums1) {
            nums[k++] = i;
        }

        for (int i : nums2) {
            nums[k++] = i;
        }

        Arrays.sort(nums);

        if (n % 2 == 0) {
            return (nums[n/2 - 1] + nums[n/2]) / 2.0;
        } else {
            return nums[n/2];
        }
    }
}