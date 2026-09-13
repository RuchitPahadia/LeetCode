class Solution {
    public int[][] merge(int[][] nums) {

        Arrays.sort(nums, (a, b) -> a[0] - b[0]);

        List<int[]> res = new ArrayList<>();

        int start = nums[0][0];
        int end = nums[0][1];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i][0] <= end) {
                end = Math.max(end, nums[i][1]);
            } 
            else {
                res.add(new int[]{start, end});

                start = nums[i][0];
                end = nums[i][1];
            }
        }

        res.add(new int[]{start, end});

        return res.toArray(new int[res.size()][]);
    }
}