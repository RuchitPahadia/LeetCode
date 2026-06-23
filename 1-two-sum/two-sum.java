import java.util.*;

class Solution {
    public int[] twoSum(int[] num, int target) {

        int[] nums = num.clone();
        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;

        int e1 = 0, e2 = 0;

        while(left < right){

            int sum = nums[left] + nums[right];

            if(sum == target){
                e1 = nums[left];
                e2 = nums[right];
                break;
            }
            else if(sum > target){
                right--;
            }
            else{
                left++;
            }
        }

        int[] res = new int[2];

        if(e1 == e2){
            int k = 0;
            for(int i=0;i<num.length;i++){
                if(num[i] == e1){
                    res[k++] = i;
                    if(k == 2) break;
                }
            }
        }
        else{
            for(int i=0;i<num.length;i++){
                if(num[i] == e1)
                    res[0] = i;

                else if(num[i] == e2)
                    res[1] = i;
            }
        }

        return res;
    }
}