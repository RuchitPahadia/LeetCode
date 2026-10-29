class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        //store val,index

        for (int i = 0; i < nums.length; i++) {

            int comp = target - nums[i];
            //find the compliment of the element

            if (map.containsKey(comp)) {//if compliment in map then sol found
                int[] res = { map.get(comp), i };
                return res;
            }
            //add the element if not found
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}