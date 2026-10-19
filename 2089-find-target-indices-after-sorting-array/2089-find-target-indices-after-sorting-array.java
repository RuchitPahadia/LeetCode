class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> res = new ArrayList<>();
        int loc=-1;
        int freq=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                if(loc==-1) loc=i;
                freq++;
            }
        }
        for(int i=0;i<freq;i++){
            res.add(loc+i);
        }
        return res;
    }
}