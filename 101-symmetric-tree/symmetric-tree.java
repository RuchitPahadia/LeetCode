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
    public boolean isSymmetric(TreeNode root) {

        return isMirror(root.left, root.right);
    }

    public boolean isMirror(TreeNode p, TreeNode q) {
        
        if (p == null && q == null) {//this refers to both the trees reaching a leaf node so catches it and continues
            return true;
        }
        if (p == null || q == null) {
            return false;
        }

        if (p.val != q.val) {
            return false;
        }
            
        return isMirror(p.right,q.left)&&isMirror(q.right,p.left);
    }
}