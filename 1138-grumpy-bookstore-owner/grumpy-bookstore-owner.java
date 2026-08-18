class Solution {
    public int maxSatisfied(int[] nums, int[] grumpy, int minutes) {
        //create a sliding window of 0,min to n-min,n
        int total=0;
        for(int i=0;i<nums.length;i++){
            if(i<minutes){
                total=total+nums[i];
            }
            else if(grumpy[i]==0){
                total=total+nums[i];
            }
        }
        int max=total;
        for(int i=0;i<nums.length-minutes;i++){
            int st=i;
            int fin=i+minutes;
            //remove the previous start of window
            if (grumpy[st] == 1) {
                total -= nums[st];
            }

            // Add the element entering the window
            if (grumpy[fin] == 1) {
                total += nums[fin];
            }

            max=Math.max(max,total);
        }
        return max;
    }
}