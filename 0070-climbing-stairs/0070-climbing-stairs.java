class Solution {
    public int climbStairs(int n) {

        int v1 = 1;
        int v2 = 1;

        for(int i = 2; i <= n; i++) {
            int res = v1 + v2;
            v1 = v2;
            v2 = res;
        }

        return v2;
    }
}