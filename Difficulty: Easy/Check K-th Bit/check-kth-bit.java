class CheckBit {
    static boolean checkKthBit(int n, int k) {
        while (k > 0) {
            n /= 2;
            k--;
        }

        return n % 2 == 1;
    }
}