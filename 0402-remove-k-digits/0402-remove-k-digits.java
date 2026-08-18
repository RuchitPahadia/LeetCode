class Solution {
    public String removeKdigits(String nums, int k) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < nums.length(); i++) {
            char curr = nums.charAt(i);

            while (!st.isEmpty() && k > 0 && st.peek() > curr) {
                st.pop();
                k--;
            }

            st.push(curr);
        }

        while (k > 0) {
            st.pop();
            k--;
        }

        if (st.isEmpty()) {
            return "0";
        }

        StringBuilder res = new StringBuilder();

        while (!st.isEmpty()) {
            res.append(st.pop());
        }

        // Convert back to correct order
        res.reverse();

        // Remove leading zeros
        int i = 0;
        while (i < res.length() - 1 && res.charAt(i) == '0') {
            i++;
        }

        res.delete(0, i);

        return res.toString();
    }
}