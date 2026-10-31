class Solution {
    public int[][] merge(int[][] nums) {

        Arrays.sort(nums, (a, b) -> a[0] - b[0]);
        int start = nums[0][0];
        int end = nums[0][1];

        List<int[]> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i][0] <= end) {
                end = Math.max(end, nums[i][1]);
            }
            else {
                res.add(new int[]{start, end});
                start = nums[i][0];
                end = nums[i][1];
            }
        }
        res.add(new int[] { start, end });
        return res.toArray(new int[res.size()][]);
    }
}