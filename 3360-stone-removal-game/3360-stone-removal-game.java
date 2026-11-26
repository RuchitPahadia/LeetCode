class Solution {
    public boolean canAliceWin(int n) {

        boolean alice = true;
        int curr = 10;

        while (n >= curr) {

            n -= curr;
            curr--;
            alice = !alice;
        }

        return !alice;
    }
}