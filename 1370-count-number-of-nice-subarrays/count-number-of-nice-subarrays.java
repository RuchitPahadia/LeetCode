class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return AtMost(nums, k) - AtMost(nums, k - 1);
    }

    public int AtMost(int[] nums, int k) {//returns for sum<=k
        int l = 0;
        int res = 0;
        for (int r = 0; r < nums.length; r++) {
            if (nums[r] % 2 != 0) {
                k--;
            }
            while (k < 0) {
                if (nums[l] % 2 != 0) {
                    k++;
                }
                l++;
            }
            res = res + r - l + 1;
        }
        return res;
    }
}
//res+res+r-l+1
//only if total subarrays else max if longhest