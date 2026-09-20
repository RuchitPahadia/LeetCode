class Solution {
    public int reverseDegree(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            // Reverse alphabetical value: 'a' -> 26, 'b' -> 25, ..., 'z' -> 1
            int revCharValue = 'z' - s.charAt(i) + 1;
            
            // Multiplied by 1-based index (i + 1)
            res += revCharValue * (i + 1);
        }
        return res;
    }
}