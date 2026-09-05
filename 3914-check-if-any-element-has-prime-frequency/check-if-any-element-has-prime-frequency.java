class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        int[] hash = new int[101];
        for (int i : nums) {
            hash[i]++;
        }
        for (int i : nums) {
            int t = hash[i];
            if (check(t)) {
                return true;
            }
        }
        return false;
    }

    public boolean check(int x) {
        if (x == 2)
            return true;
        if (x == 1)
            return false;
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}