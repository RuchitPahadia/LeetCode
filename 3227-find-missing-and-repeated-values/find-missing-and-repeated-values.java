class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        int x = grid.length;
        int y = grid[0].length;
        int n = x * y;

        int[] nums = new int[n];
        int[] res = new int[2];

        for (int i = 0; i < n; i++) {
            int row = i / y;
            int col = i % y;
            nums[i] = grid[row][col];
        }

        Arrays.sort(nums);

        // Missing number is 1
        if (nums[0] != 1) {
            res[1] = 1;
        }

        for (int i = 0; i < n - 1; i++) {

            if (nums[i] == nums[i + 1]) {
                res[0] = nums[i];
                continue;
            }

            if (res[1] == 0 && nums[i + 1] != nums[i] + 1) {
                res[1] = nums[i] + 1;
            }
        }

        // Missing number is n
        if (res[1] == 0) {
            res[1] = n;
        }

        return res;
    }
}