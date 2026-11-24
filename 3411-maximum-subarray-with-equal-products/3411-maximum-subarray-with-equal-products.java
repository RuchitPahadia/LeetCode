class Solution {
    public int maxLength(int[] nums) {
        int res = 2;
        int prod = 1;
        int n = nums.length;
        int l = 0,
            r = 0;
        while(r < n){
            while(gcd(prod , nums[r]) > 1){
                prod /= nums[l];
                l++;
            }
            prod *= nums[r];
            res = Math.max(res , r - l + 1);
            r++;
        }
        return res;
    }
    private int gcd(int x, int y){
        while(y != 0){
            int temp = x;
            x = y;
            y = temp % y;
        }
        return x;
    }
}