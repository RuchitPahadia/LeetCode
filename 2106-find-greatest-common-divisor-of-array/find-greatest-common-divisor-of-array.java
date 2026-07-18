class Solution {
    public int findGCD(int[] nums) {
        int a=0;
        int b=nums[0];
        for(int i:nums){
            a=Math.max(i,a);
            b=Math.min(i,b);
        }
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}