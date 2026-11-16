
class Solution {
    public String digitSum(String s, int k) {

        while (s.length() > k) {

            List<String> temp = new ArrayList<>();

            // Split into chunks of size k
            for (int i = 0; i < s.length(); i += k) {
                temp.add(s.substring(i, Math.min(s.length(), i + k)));
            }

            StringBuilder sb = new StringBuilder();

            // Calculate sum of each chunk
            for (String str : temp) {
                int curr = 0;

                for (int j = 0; j < str.length(); j++) {
                    curr += str.charAt(j) - '0';
                }

                sb.append(curr);
            }

            s = sb.toString();
        }

        return s;
    }
}
