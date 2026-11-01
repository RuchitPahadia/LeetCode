class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int min =nums[0];
        for(int i: nums){
            min = Math.min(min, i);
        }
        int mooves = 0;
        for(int i: nums){
            mooves = mooves + i-min;
        }
        return mooves;
    }
}