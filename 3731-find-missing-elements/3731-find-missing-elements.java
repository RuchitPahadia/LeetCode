class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        int min = nums[0];
        int max = nums[0];

        for(int i:nums){
            min=Math.min(min,i);
            max=Math.max(max,i);
        }
        List<Integer> res = new ArrayList<>();
        Arrays.sort(nums);
        int ptr=0;

        for(int i=min;i<=max;i++){
            while (ptr < nums.length && nums[ptr] < i) {
                ptr++;
            }
            if (ptr == nums.length || nums[ptr] != i) {
                res.add(i);
            }
        }
        return res;
    }
}