class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char t = s.charAt(i);

            if (t == '(' || t == '{' || t == '[') {
                stack.push(t);
            } else {
                if (stack.isEmpty())
                    return false;

                if ((t == ')' && stack.peek() == '(') ||
                    (t == ']' && stack.peek() == '[') ||
                    (t == '}' && stack.peek() == '{')) {

                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}