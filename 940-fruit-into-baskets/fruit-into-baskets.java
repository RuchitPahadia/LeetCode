class Solution {
    public int totalFruit(int[] nums) {
        //find the longest subarray with 2 types of elements
        int l = 0;
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();//map with freq of elements
        for(int r=0;r<nums.length;r++){
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);
//add current element
            while(map.size()>2){//if window has >2 elements
                map.put(nums[l],map.get(nums[l])-1);//remove curr

                if(map.get(nums[l])==0){//if freq is zero remove from map to make space
                    map.remove(nums[l]);
                }
                l++;
            }
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}