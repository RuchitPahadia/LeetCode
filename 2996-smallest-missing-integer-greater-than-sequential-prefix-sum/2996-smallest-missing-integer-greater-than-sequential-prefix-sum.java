class Solution {
    public int missingInteger(int[] nums) {

        int curr = nums[0];
        int res = 0;
        for (int i : nums) {
            if (i == curr) {
                res += i;
                curr++;
            } else {
                break;
            }
        }

        Arrays.sort(nums);

        int res1 = res;
        
        for (int i : nums) {
            if (i == res1) {
                res1++;
            }
        }

        return res1;
    }
}