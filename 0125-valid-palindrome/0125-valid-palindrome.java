class Solution {
    public boolean isPalindrome(String s) {
        List<Character> inp = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                inp.add(Character.toLowerCase(s.charAt(i)));
            }
        }

        return check(inp, 0);
    }

    public boolean check(List<Character> s, int i) {
        int n = s.size();
        int j = n - 1 - i;

        if (i >= j) {
            return true;
        }

        if (s.get(i).equals(s.get(j))) {
            return check(s, i + 1);
        }

        return false;
    }
}