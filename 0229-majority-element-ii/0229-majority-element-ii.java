class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int ele1 = nums[0];
        int ele2 = nums[0];
        int c1 = 0;
        int c2 = 0;
        for(int i: nums){
            if(i==ele1){
                c1++;
            }
            else if(i == ele2){
                c2++;
            }
            else if(c1 == 0){
                ele1 = i;
                c1 = 1;
            }
            else if(c2 == 0){
                ele2 = i;
                c2 = 1;
            }
            else{
                c1--;
                c2--;
            }
        }

        int f1 =0;
        int f2 = 0;
        for(int i:nums){
            if(ele1 == i){
                f1++;
            }
            if(ele2 == i){
                f2++;
            }
        }

        List<Integer> res = new ArrayList<>();
        if(f1>nums.length/3){
            res.add(ele1);
        }
        if(f2>nums.length/3 && ele1 != ele2){
            res.add(ele2);
        }
        return res;
    }
}