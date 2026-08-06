class Solution {
    public int[] nextGreaterElement(int[] n1, int[] n2) {

        int[] res = new int[n1.length];

        for (int i = 0; i < n1.length; i++) {

            boolean found = false;
            res[i] = -1;

            for (int j = 0; j < n2.length; j++) {

                if (n2[j] == n1[i]) {
                    found = true;
                }

                if (found && n2[j] > n1[i]) {
                    res[i] = n2[j];
                    break;
                }
            }
        }

        return res;
    }
}