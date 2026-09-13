class Solution {
    public int candy(int[] nums) {

        int n = nums.length;
        int[] res = new int[n];

        Arrays.fill(res, 1);

        // Left to right
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                res[i] = res[i - 1] + 1;
            }
        }

        // Right to left
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] > nums[i + 1]) {
                res[i] = Math.max(res[i], res[i + 1] + 1);
            }
        }

        int ans = 0;

        for (int candy : res) {
            ans += candy;
        }

        return ans;
    }
}