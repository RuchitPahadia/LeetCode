/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int countNodes(TreeNode root) {
        int right = right(root);
        int left = left(root);

        if (right == left) {
            return (1 << left) - 1;
        }

        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public int right(TreeNode root) {
        int h = 0;
        while (root != null) {
            h++;
            root = root.right;
        }
        return h;
    }

    public int left(TreeNode root) {
        int h = 0;
        while (root != null) {
            h++;
            root = root.left;
        }
        return h;
    }
}