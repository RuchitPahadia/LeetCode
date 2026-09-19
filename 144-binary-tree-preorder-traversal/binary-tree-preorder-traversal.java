class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;

        Stack<TreeNode> stk = new Stack<>();
        stk.push(root);

        while (!stk.isEmpty()) {
            TreeNode node = stk.pop();
            res.add(node.val);

            if (node.right != null)
                stk.push(node.right);

            if (node.left != null)
                stk.push(node.left);
        }

        return res;
    }
}