import java.util.*;
class Solution {
    public String removeOuterParentheses(String s) {
        Deque<Integer> stk = new ArrayDeque<>();
        String[] str = s.split("");
        int ctr = 0;
        StringBuilder res = new StringBuilder();
        for(String i : str){
            if(i.equals("(")){
                if(ctr==0){
                    ctr++;
                    continue;
                }
                else{
                    ctr++;
                    res.append("(");
                }
            }
            if(i.equals(")")){
                if(ctr==1){
                    ctr--;
                    continue;
                }
                else{
                    ctr--;
                    res.append(")");
                }
            }
        }
        return res.toString();
    }
}