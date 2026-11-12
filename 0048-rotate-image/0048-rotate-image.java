class Solution {
    public void rotate(int[][] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                int temp = nums[i][j];
                nums[i][j] = nums[j][i];
                nums[j][i] = temp;                
            }
        }
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length/2;j++){

                int temp = nums[i][j];
                nums[i][j] = nums[i][nums.length-1-j];
                nums[i][nums.length-1-j] = temp;
            }
        }
    }
}