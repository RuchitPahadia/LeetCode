class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hash = new HashSet<>(); //create hash to store values
        int max = 0;
        for (int i : nums) {//store nums in hasg
            hash.add(i);
        }
        for (int i :hash) {//iterate over hash instead of nums to avoid processing dupes
            int x = i;
            int count = 1;
            if (hash.contains(x - 1)) {//check if element already processed
                continue;
            }
            while (hash.contains(x + 1)) {//check for next elements
                x++;
                count++;
            }
            max = Math.max(max, count);//update max
        }
        return max;
    }
}