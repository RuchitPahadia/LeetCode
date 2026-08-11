class Solution {
    public int trap(int[] arr) {
        int n = arr.length;
        int res = 0;
        int lmax = 0;
        int rmax = 0;
        int l = 0;
        int r = n - 1;

        while (l < r) {

            if (arr[l] <= arr[r]) {
                if (lmax >= arr[l]) {
                    res = res + lmax - arr[l];
                }
                else {
                    lmax = arr[l];
                }

                l++;
            }

            else {
                if (rmax >= arr[r]) {
                    res = res + rmax - arr[r];
                }
                else {
                    rmax = arr[r];
                }
                r--;
            }
        }

        return res;
    }
}