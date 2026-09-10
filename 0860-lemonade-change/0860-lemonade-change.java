class Solution {
    public boolean lemonadeChange(int[] bills) {
        int b5 = 0;
        int b10 = 0;
        for (int i : bills) {
            if (i == 5) {
                b5++;
            } else if (i == 10) {
                b5--;
                b10++;
            } else if (i == 20) {
                if (b10 > 0) {
                    b5--;
                    b10--;
                }
                else{
                    b5=b5-3;
                }
            }
            if (b5 < 0 || b10 < 0) {
                return false;
            }
        }
        return true;
    }
}