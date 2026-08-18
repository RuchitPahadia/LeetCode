class Solution {
    public int minOperations(int[] nums, int k) {
        if(nums.length<2) return -1;
        int res=0;
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(int i:nums){
            pq.add((long) i);
        }
        //pq.poll() to remove
        while(pq.size() >= 2 && pq.peek() < k){
            long x=pq.poll();
            long y=pq.poll();
            pq.add(x * 2 + y);
            res++;
        }
        
        return res;
    }
}