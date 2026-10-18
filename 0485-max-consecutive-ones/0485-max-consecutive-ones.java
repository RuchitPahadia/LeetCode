class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                j=j+1;
                cnt=Math.max(cnt,j);
            }
            else
                j=0;
        }
        return cnt;
    }
}