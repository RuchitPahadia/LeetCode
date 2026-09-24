class Solution {
    public int smallestIndex(int[] nums) {
        int res = -1;
        for (int i = 0; i < nums.length; i++) {
            int sum = check(nums[i]);
            if (sum == i) {
                res = i;
                break;
            }
        }
        return res;
    }

    public int check(int x) {
        int sum = 0;

        while (x > 0) {
            sum += x % 10;
            x = x / 10;
        }

        return sum;
    }
}