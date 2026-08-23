class Solution {
    public int longestOnes(int[] nums, int k) {
        int next = 0;
        int zero = 0;
        int l = 0;
        int max = 0;
        int n = nums.length;
        for (int r = 0; r < n; r++) {//inrementing right ptr
            if (nums[r] == 0) {
                zero++;
            }
            //when an invalid window detected moove l ptr
            while (zero > k) {
                if (nums[l] == 0) {
                    zero--;
                }
                l++;
            }
            //update max length
            max = Math.max(max, r - l + 1);
        }
        return max;
    }
}//use right pointr to check not left