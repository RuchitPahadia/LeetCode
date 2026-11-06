import java.util.*;

class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {

        Arrays.sort(logs, (a, b) -> Integer.compare(a[1], b[1]));

        int m = queries.length;
        int[] ans = new int[m];
        int[] freq = new int[n + 1];

        Integer[] idx = new Integer[m];

        for (int i = 0; i < m; i++) {
            idx[i] = i;
        }

        Arrays.sort(idx, (a, b) -> Integer.compare(queries[a], queries[b]));

        int left = 0, right = 0;
        int active = 0;

        for (int i : idx) {
            int q = queries[i];
            int start = q - x;

            // Add logs up to query time
            while (right < logs.length && logs[right][1] <= q) {
                int server = logs[right][0];

                if (freq[server] == 0) {
                    active++;
                }

                freq[server]++;
                right++;
            }

            // Remove logs before the window starts
            while (left < right && logs[left][1] < start) {
                int server = logs[left][0];

                freq[server]--;

                if (freq[server] == 0) {
                    active--;
                }

                left++;
            }

            ans[i] = n - active;
        }

        return ans;
    }
}