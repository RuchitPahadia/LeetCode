
import java.util.*;

class Solution {

    public int smallestUniqueSubarray(int[] nums) {

        int n = nums.length;

        // Coordinate compression
        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        int[] s = new int[n + 1];

        for (int i = 0; i < n; i++) {
            s[i] = Arrays.binarySearch(sorted, nums[i]) + 1;
        }

        // Sentinel
        s[n] = 0;

        int m = n + 1;

        // Build suffix array
        int[] sa = new int[m];
        int[] c = new int[m];

        int[] cnt = new int[Math.max(m, n + 2)];

        for (int x : s) {
            cnt[x]++;
        }

        for (int i = 1; i < cnt.length; i++) {
            cnt[i] += cnt[i - 1];
        }

        for (int i = m - 1; i >= 0; i--) {
            sa[--cnt[s[i]]] = i;
        }

        int classes = 1;
        c[sa[0]] = 0;

        for (int i = 1; i < m; i++) {
            if (s[sa[i]] != s[sa[i - 1]]) {
                classes++;
            }
            c[sa[i]] = classes - 1;
        }

        int[] pn = new int[m];
        int[] cn = new int[m];

        for (int len = 1; len < m; len *= 2) {

            for (int i = 0; i < m; i++) {
                pn[i] = sa[i] - len;
                if (pn[i] < 0) {
                    pn[i] += m;
                }
            }

            Arrays.fill(cnt, 0);

            for (int x : pn) {
                cnt[c[x]]++;
            }

            for (int i = 1; i < classes; i++) {
                cnt[i] += cnt[i - 1];
            }

            for (int i = m - 1; i >= 0; i--) {
                int x = pn[i];
                sa[--cnt[c[x]]] = x;
            }

            cn[sa[0]] = 0;
            int newClasses = 1;

            for (int i = 1; i < m; i++) {

                int cur = sa[i];
                int prev = sa[i - 1];

                if (c[cur] != c[prev] ||
                    c[(cur + len) % m] !=
                    c[(prev + len) % m]) {
                    newClasses++;
                }

                cn[cur] = newClasses - 1;
            }

            int[] temp = c;
            c = cn;
            cn = temp;

            classes = newClasses;

            if (classes == m) break;
            if (len > m / 2) break;
        }

        // Remove sentinel suffix
        int[] rank = new int[n];
        int[] order = new int[n];

        for (int i = 1; i < m; i++) {
            order[i - 1] = sa[i];
            rank[sa[i]] = i - 1;
        }

        // Kasai's LCP algorithm
        int[] lcp = new int[n];
        int k = 0;

        for (int i = 0; i < n; i++) {

            int r = rank[i];

            if (r == 0) continue;

            int j = order[r - 1];

            while (i + k < n && j + k < n &&
                   nums[i + k] == nums[j + k]) {
                k++;
            }

            lcp[r] = k;

            if (k > 0) k--;
        }

        // Find minimum unique subarray length
        int ans = n;

        for (int r = 0; r < n; r++) {

            int i = order[r];

            int prev = lcp[r];
            int next = (r == n - 1) ? 0 : lcp[r + 1];

            int required = Math.max(prev, next) + 1;

            if (required <= n - i) {
                ans = Math.min(ans, required);
            }
        }

        return ans;
    }
}
