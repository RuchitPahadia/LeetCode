class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int res = 0;
        int l = 0, r = 0;
        int[] hash = new int[256];
        for (int i = 0; i < 256; i++) {
            hash[i] = -1;
        }
        while (r < n) {
            //if the left ptr is already i the substr
            if (hash[s.charAt(r)] != -1) {
                l = Math.max(hash[s.charAt(r)] + 1, l);
            }
            res = Math.max(res, r - l + 1);
            hash[s.charAt(r)] = r;
            r++;
        }
        return res;
    }
}