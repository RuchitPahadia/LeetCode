class Solution {
    public String reverseWords(String s) {

        StringBuilder res = new StringBuilder();
        String[] arr = s.split(" ");

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i].equals("")) {
                continue;
            }
            else {
                res.append(arr[i]);
                res.append(" ");
            }
        }
        res.deleteCharAt(res.length() - 1);
        return res.toString();
    }
}