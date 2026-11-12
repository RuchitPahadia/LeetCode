class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        // First row
        List<Integer> ans = List.of(1);
        res.add(ans);

        for (int i = 1; i < numRows; i++) {
            List<Integer> curr = new ArrayList<>();

            // Row boundaries
            curr.add(1);

            // Middle elements
            for (int j = 1; j < i; j++) {
                curr.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
            }

            // Last element
            curr.add(1);
            res.add(curr);
        }

        return res;
    }
}