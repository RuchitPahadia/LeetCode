
class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0)
            return new ArrayList<>();

        HashMap<Integer, String> map = new HashMap<>();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");

        List<String> res = new ArrayList<>();
        res.add("");

        for (int i = 0; i < digits.length(); i++) {

            int curr = digits.charAt(i) - '0';
            String s = map.get(curr);
            res = add(res, s);
        }

        return res;
    }

    public List<String> add(List<String> res, String s) {
        List<String> ans = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < res.size(); j++) {
                ans.add(res.get(j) + s.charAt(i));
            }
        }

        return ans;
    }
}
