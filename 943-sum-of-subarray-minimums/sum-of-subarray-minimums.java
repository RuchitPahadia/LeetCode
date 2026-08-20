class Solution {
    public int sumSubarrayMins(int[] nums) {
        int[] pse = prev(nums);
        int[] nse = next(nums);

        int mod = (int) 1e9 + 7;
        long sum = 0;

        for (int i = 0; i < nums.length; i++) {

            int left = i - pse[i];
            int right = nse[i] - i;

            long freq = (long) left * right;

            sum = (sum + freq * nums[i]) % mod;
        }

        return (int) sum;
    }

    // Previous strictly smaller
    public int[] prev(int[] curr) {
        int n = curr.length;
        Stack<Integer> st = new Stack<>();
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && curr[st.peek()] >= curr[i]) {
                st.pop();
            }

            res[i] = !st.isEmpty() ? st.peek() : -1;

            st.push(i);
        }

        return res;
    }

    // Next smaller or equal
    public int[] next(int[] curr) {
        int n = curr.length;
        Stack<Integer> st = new Stack<>();
        int[] res = new int[n];

        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && curr[st.peek()] > curr[i]) {
                st.pop();
            }

            res[i] = !st.isEmpty() ? st.peek() : n;

            st.push(i);
        }

        return res;
    }
}