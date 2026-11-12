class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        boolean incr = false;
        int l = 0;
        int r = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {//check increasing loop
            int curr = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[j - 1]) {
                    curr++;
                } else
                    break;
            }
            count = Math.max(count, curr);
        }
        for (int i = 0; i < nums.length; i++) {//check decreasing loop
            int curr = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[j - 1]) {
                    curr++;
                } else
                    break;
            }
            count = Math.max(count, curr);
        }
        return count;
    }
}