class Solution {
    public int minMoves(int[] nums) {
        int max = Integer.MIN_VALUE;
        int res = 0;
        for(int i:nums){
            max = Math.max(i,max);
        }
        for(int i:nums){
            res = res + max - i;
        }
        return res;
    }
}