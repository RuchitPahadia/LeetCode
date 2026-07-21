class Solution {
    private long MOD = 1_000_000_007;
    public int countGoodNumbers(long n) {

        long x=pow(4,n/2)%MOD;
        long y=pow(5,(n+1)/2)%MOD;
        return (int)((x*y)%MOD);
    }
    public long pow(long x,long n) {
        if(n==0)
            return 1;
        long temp=pow(x,n/2);
        
        if(n%2==0)
            return (temp*temp)%MOD;
        else
            return (x*temp*temp)%MOD;
    }
}