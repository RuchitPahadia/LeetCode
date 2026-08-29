class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return AtMost(nums, goal) - AtMost(nums, goal - 1);
    }

    public int AtMost(int[] nums, int goal) {
        if (goal < 0)
            return 0;
        int l = 0;
        int res = 0;
        int n = nums.length;
        int sum = 0;
        for (int r = 0; r < n; r++) {
            sum = sum + nums[r];
            while (sum > goal) {
                sum = sum - nums[l++];
            }
            res = res + (r - l + 1);
        }
        return res;
    }
}