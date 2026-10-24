class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int freq = 0;
        int max = 0;
        int ele = nums[0];
        for(int i = 1; i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                freq++;
            }
            else{
                freq = 0;
            }
            if(max<freq){
                max = freq;
                ele = nums[i];
            }
        }
        return ele;
    }
}