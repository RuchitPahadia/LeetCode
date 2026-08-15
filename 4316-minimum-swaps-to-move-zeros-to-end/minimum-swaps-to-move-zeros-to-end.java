class Solution {
    public int minimumSwaps(int[] nums) {
        int res=0;
        int x=0;
        for(int i:nums){
            if(i==0)
                x++;
        }
        for(int i=0;i<nums.length-x;i++){
            if(nums[i]==0){
                res++;
            }
        }
        return res;
    }
}