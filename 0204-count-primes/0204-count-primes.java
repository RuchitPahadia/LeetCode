class Solution {
    public int countPrimes(int n) {
        List<Integer> hash = new ArrayList<>();
        int res = 0;
        for(int i = 2; i < n; i++) {
            boolean prime = true;
            
            for(int j = 0; j < hash.size(); j++) {
                if(hash.get(j) > Math.sqrt(i)) break;

                if(i % hash.get(j) == 0) {
                    prime = false;
                    break;
                }
            }

            if(prime) {
                res++;
                hash.add(i);
            }
        }

        return res;
    }
}