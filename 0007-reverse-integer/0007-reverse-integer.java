class Solution {
    public int reverse(int x) {
        int curr=Math.abs(x);
        int res=0;
        int i=1;  //place
        while (curr > 0) {
            int n = curr % 10;
            res = res * 10 + n;
            curr /= 10;
        }
                        
        if(x<0)
            return res*(-1);

        if((res>Integer.MAX_VALUE/10) || (res<Integer.MIN_VALUE/10) )
            return 0;

        return res;

    }
}