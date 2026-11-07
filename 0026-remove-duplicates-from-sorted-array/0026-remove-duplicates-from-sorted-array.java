class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        int l = 1;
        int r = 1;
        
        while (r < nums.length) {
            while (r < nums.length && nums[r] == nums[r - 1]) {
                r++;
            }
            if (r < nums.length) {
                nums[l] = nums[r];
                l++;
                r++;
            }
        }
        
        return l;
    }
}
