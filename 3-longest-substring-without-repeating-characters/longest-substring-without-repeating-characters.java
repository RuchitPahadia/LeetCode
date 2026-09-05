class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int res = 0;
        int l = 0, r = 0;
        int[] hash = new int[256];
        Arrays.fill(hash, -1);

        for(r=0;r<s.length();r++){
            //if the left ptr is already i the substr moove it right 
            if (hash[s.charAt(r)] != -1) {
                l = Math.max(hash[s.charAt(r)] + 1, l);
            }
            res = Math.max(res, r - l + 1);
            hash[s.charAt(r)] = r;
        }
        return res;
    }
}