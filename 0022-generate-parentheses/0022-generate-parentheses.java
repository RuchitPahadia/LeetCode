class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res= new ArrayList<>();
        backtrack("",0,0,n,res);
        return res;
    }
    public void backtrack(String curr, int op, int cl, int n, List<String> res) {
        if(curr.length()==n*2){
            res.add(curr);
            return;
        }
        if(op<n){
            backtrack(curr+"(",op+1,cl,n,res);
        }
        if(cl<op){
            backtrack(curr+")",op,cl+1,n,res);
        }
    }
}