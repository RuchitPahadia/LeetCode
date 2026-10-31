class Solution {
    public int addMinimum(String s) {
        int res = 0;
        int n = 0;

        while (n < s.length()) {

            if (s.charAt(n) == 'a') {
                n++;
            } else {
                res++;
            }

            if (n < s.length() && s.charAt(n) == 'b') {
                n++;
            } else {
                res++;
            }

            if (n < s.length() && s.charAt(n) == 'c') {
                n++;
            } else {
                res++;
            }
        }

        return res;
    }
}