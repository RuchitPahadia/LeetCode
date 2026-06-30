class Solution {
    public int romanToInt(String s) {
        int res = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            int curr = valof(s.charAt(i));
            int next = valof(s.charAt(i + 1));

            if (curr < next) {
                res -= curr;
            } else {
                res += curr;
            }
        }

        res += valof(s.charAt(s.length() - 1));

        return res;
    }

    public int valof(char c) {
        return switch (c) {
            case 'M' -> 1000;
            case 'D' -> 500;
            case 'C' -> 100;
            case 'L' -> 50;
            case 'X' -> 10;
            case 'V' -> 5;
            case 'I' -> 1;
            default -> 0;
        };
    }
}