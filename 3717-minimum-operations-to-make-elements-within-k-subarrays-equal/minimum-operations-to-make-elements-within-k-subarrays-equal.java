
import java.util.*;

class Solution {
    static class MyMap {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int size = 0;
        long sum = 0;

        void add(int val) {
            map.merge(val, 1, Integer::sum);
            size++;
            sum += val;
        }

        void remove(int val) {
            map.merge(val, -1, Integer::sum);
            if (map.get(val) == 0) map.remove(val);
            size--;
            sum -= val;
        }

        int first() {
            return map.firstKey();
        }

        int last() {
            return map.lastKey();
        }
    }

    public long minOperations(int[] nums, int x, int k) {
        int n = nums.length;
        long[] cost = new long[n - x + 1];

        MyMap low = new MyMap();
        MyMap high = new MyMap();

        for (int i = 0; i < n; i++) {
            if (low.size == 0 || nums[i] <= low.last())
                low.add(nums[i]);
            else
                high.add(nums[i]);

            if (i >= x) {
                int out = nums[i - x];

                if (low.map.containsKey(out))
                    low.remove(out);
                else
                    high.remove(out);
            }

            while (low.size < high.size) {
                int val = high.first();
                high.remove(val);
                low.add(val);
            }

            while (low.size > high.size + 1) {
                int val = low.last();
                low.remove(val);
                high.add(val);
            }

            if (i >= x - 1) {
                long median = low.last();

                cost[i - x + 1] =
                    median * low.size - low.sum +
                    high.sum - median * high.size;
            }
        }

        long[][] dp = new long[n + 1][k + 1];

        for (int i = 0; i <= n; i++)
            Arrays.fill(dp[i], Long.MAX_VALUE / 2);

        for (int i = 0; i <= n; i++)
            dp[i][0] = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                dp[i][j] = dp[i - 1][j];

                if (i >= x) {
                    dp[i][j] = Math.min(
                        dp[i][j],
                        dp[i - x][j - 1] + cost[i - x]
                    );
                }
            }
        }

        return dp[n][k];
    }
}
