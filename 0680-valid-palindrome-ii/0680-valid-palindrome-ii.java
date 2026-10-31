class Solution {
    public boolean validPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        if (pal(s, l, r)) {
            return true;
        }
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return pal(s, l, r - 1) || pal(s, l + 1, r);
            }
            l++;
            r--;
        }
        return false;
    }

    public boolean pal(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false; // Mismatch found, not a palindrome
            }
            l++;
            r--;
        }
        return true;
    }
}