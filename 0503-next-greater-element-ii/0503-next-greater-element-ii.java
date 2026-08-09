import java.util.Stack;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> stk = new Stack<>();
        int[] ans = new int[n];

        for (int i = 2 * n - 1; i >= 0; i--) {
            int curr = nums[i % n];

            while (!stk.isEmpty() && stk.peek() <= curr) {
                stk.pop();
            }

            if (i < n) {
                ans[i] = stk.isEmpty() ? -1 : stk.peek();
            }

            stk.push(curr);
        }

        return ans;
    }
}