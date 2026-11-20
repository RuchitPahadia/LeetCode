
class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 1;

        // Find the breakpoint
        while(i > 0 && nums[i-1] >= nums[i]){
            i--;
        }

        if(i == 0){
            reverse(nums, 0, nums.length - 1);
            return;
        }

        // Find the next greater element
        int j = nums.length - 1;
        while(nums[j] <= nums[i-1]){
            j--;
        }

        // Swap
        swap(nums, i-1, j);

        // Reverse the suffix
        reverse(nums, i, nums.length - 1);
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int l, int r){
        while(l < r){
            swap(nums, l, r);
            l++;
            r--;
        }
    }
}
