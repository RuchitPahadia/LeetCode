class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        int n=arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Integer> stk = new Stack<>();
        for(int i=n-1;i>=0;i--){
            int curr=arr[i];
            
            while(!stk.isEmpty() && stk.peek()<=curr){
                stk.pop();
            }
            
            if(stk.isEmpty()){
                res.add(0,-1);
            }
            else{
                res.add(0,stk.peek());
            }
            stk.push(arr[i]);
        }
        return res;
    }
}