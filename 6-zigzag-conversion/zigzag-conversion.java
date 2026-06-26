class Solution {
    public String convert(String s, int row) {

        if (row == 1 || row >= s.length()) {
            return s;
        }

        StringBuilder[] rows = new StringBuilder[row];

        for (int i = 0; i < row; i++) {
            rows[i] = new StringBuilder();
        }

        int currRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {

            rows[currRow].append(c);

            if (currRow == 0 || currRow == row - 1) {
                goingDown = !goingDown;
            }

            currRow += goingDown ? 1 : -1;
        }

        StringBuilder res = new StringBuilder();

        for (StringBuilder r : rows) {
            res.append(r);
        }

        return res.toString();
    }
}