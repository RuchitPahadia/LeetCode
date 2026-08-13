class Solution {
    public int minimumIndex(int[] cap, int size) {
        int min=Integer.MAX_VALUE;
        int idx=-1;
        for(int i=0;i<cap.length;i++){
            if(cap[i]>=size){
                if(cap[i]<min){
                    idx=i;
                    min=cap[i];
                }
            }
        }
        return idx;
    }
}