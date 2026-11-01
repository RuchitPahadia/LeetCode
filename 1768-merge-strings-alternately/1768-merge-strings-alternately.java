class Solution {
    public String mergeAlternately(String s1, String s2) {
        StringBuilder res = new StringBuilder();
        for(int i = 0;i<Math.max(s1.length(),s2.length());i++){
            if(i<s1.length()){
                res.append(s1.charAt(i));
            }
            if(i<s2.length()){
                res.append(s2.charAt(i));
            }
        }
        return res.toString();
    }
}