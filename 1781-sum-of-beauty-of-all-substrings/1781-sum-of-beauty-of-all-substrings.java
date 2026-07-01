class Solution {
    public int beautySum(String s) {
        int a=0,b=0,c=0;
        int res=0;
        for(int i=0;i<s.length()-2;i++){
            int[] freq = new int[26];
            for(int j=i;j<s.length();j++){
                //substr is s[i,j]
                freq[s.charAt(j) - 'a']++;
                int max=0;
                int min=Integer.MAX_VALUE;
                for(int f:freq) {
                    if(f==0)
                        continue;
                    max=Math.max(max, f);
                    min=Math.min(min, f);
                }
                res+=(max-min);
                
            }
        }
        return res;
    }
}