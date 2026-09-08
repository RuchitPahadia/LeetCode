class Solution {
    public int jump(int[] nums) {
        int min=0;
        int curr=0;
        int farthest=0;
        for(int i=0;i<nums.length-1;i++){
            farthest=Math.max(farthest,i+nums[i]);
            while(curr==i){
                curr=farthest;
                min++;
            }
        }
        return min;
    }
}