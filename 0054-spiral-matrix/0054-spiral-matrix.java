
class Solution {
    public List<Integer> spiralOrder(int[][] nums) {
        int top = 0;
        int bottom = nums.length - 1;
        int left = 0;
        int right = nums[0].length - 1;

        List<Integer> res = new ArrayList<>();

        while (top <= bottom && left <= right) {

            //left to right
            for (int i = left; i <= right; i++) {
                res.add(nums[top][i]);
            }
            top++; // Move top boundary down

            //top to bottom
            for (int i = top; i <= bottom; i++) {
                res.add(nums[i][right]);
            }
            right--; // Move right boundary left

            //right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    res.add(nums[bottom][i]);
                }
                bottom--; // Move bottom boundary up
            }

            //bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    res.add(nums[i][left]);
                }
                left++; // Move left boundary right
            }
        }

        return res;
    }
}
