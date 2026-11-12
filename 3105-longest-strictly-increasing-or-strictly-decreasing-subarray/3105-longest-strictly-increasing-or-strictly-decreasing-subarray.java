class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc = 1;
        int dec = 1;
        int res = 1;
        for(int i = 1; i<nums.length; i++){
            if(nums[i]>nums[i-1]){//increasing
                inc++;
                dec = 1;
            }
            else if(nums[i]<nums[i-1]){//decreasing
                dec++;
                inc = 1;
            }
            else{
                inc = 1;
                dec = 1;
            }
            res = Math.max(inc , Math.max(dec , res));
        }
        return res;
    }
}