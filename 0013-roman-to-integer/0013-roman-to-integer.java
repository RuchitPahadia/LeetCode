class Solution {
    public int romanToInt(String s) {
        int res=0;
        String[] s1=s.split("");
        int[] nums = new int[s1.length];
        for(int i = 0;i<nums.length;i++){
            nums[i]=valof(s1[i]);
        }
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                res-=nums[i];
            }
            else{
                res+=nums[i];
            }
        }
        res+=nums[nums.length-1];
        
        return res;
    }
    public int valof(String c){
        return switch (c) {
            case "M" -> 1000;
            case "D" -> 500;
            case "C" -> 100;
            case "L" -> 50;
            case "X" -> 10;
            case "V" -> 5;
            case "I" -> 1;
            default -> 0;
        };
    }
}