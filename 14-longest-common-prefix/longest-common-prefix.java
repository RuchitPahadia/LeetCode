class Solution {
    public String longestCommonPrefix(String[] nums) {
        Arrays.sort(nums);
        int n= Math.min(nums[0].length(),nums[nums.length-1].length());
        for(int i=0;i<n;i++){//letters
            if((nums[0].charAt(i))!=(nums[nums.length-1].charAt(i))){
                return nums[0].substring(0,i);
            }
        }
        return nums[0].substring(0, n);
    }
}