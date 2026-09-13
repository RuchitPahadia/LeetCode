class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int gi = 0, si = 0;
        Arrays.sort(g);
        Arrays.sort(s);

        while (gi < g.length && si < s.length) {
            if (s[si] >= g[gi])
                gi++;
            si++;
        }

        return gi;
    }
}