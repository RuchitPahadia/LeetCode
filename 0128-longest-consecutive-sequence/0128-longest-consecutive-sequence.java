class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        int max = 0;
        int count = 1;
        for (int i : nums) {
            hash.add(i);
        }
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (hash.contains(x - 1)) {
                continue;
            }
            while (hash.contains(x + 1)) {
                x++;
                count++;
            }
            max = Math.max(max, count);
            count = 1;

        }
        return max;
    }
}