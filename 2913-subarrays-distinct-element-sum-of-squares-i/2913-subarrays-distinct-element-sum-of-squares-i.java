class Solution {
    public int sumCounts(List<Integer> nums) {
        int start = 0;
        int end = 0;
        int res = 0;
        for(int i=0;i<nums.size();i++){
            HashSet<Integer> hash = new HashSet<Integer>();
            for(int j = i;j<nums.size();j++){
                hash.add(nums.get(j));
                res = res + hash.size()*hash.size();
            }
        }
        return res;
    }
}