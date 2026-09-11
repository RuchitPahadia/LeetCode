class Solution {
    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(date(date1)-date(date2));
    }

    public int date(String s) {
        int year = (s.charAt(0) - '0') * 1000
                + (s.charAt(1) - '0') * 100
                + (s.charAt(2) - '0') * 10
                + (s.charAt(3) - '0');

        int month = (s.charAt(5) - '0') * 10
                + (s.charAt(6) - '0');

        int day = (s.charAt(8) - '0') * 10
                + (s.charAt(9) - '0');

        // Days in complete years before this year
        int y = year - 1900;

        int res = y * 365;

        // Number of leap years from 1900 to year-1
        int leap = (year - 1) / 4 - 1899 / 4;

        res += leap;

        // Days in complete months
        int[] days = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        for (int i = 0; i < month - 1; i++) {
            res += days[i];

            // February in a leap year
            if (i == 1 && isLeap(year)) {
                res++;
            }
        }

        // Current day
        res += day;

        return res;
    }

    public boolean isLeap(int year) {
        return year % 400 == 0 ||
               (year % 4 == 0 && year % 100 != 0);
    }

}