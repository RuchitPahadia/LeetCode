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
    public void flatten(TreeNode root) {
        Stack<TreeNode> stk = new Stack<>();
        if(root==null){
            return;
        }
        stk.push(root);
        
        TreeNode prev = null;
        while(!stk.isEmpty()){
            TreeNode node = stk.pop();
            
            if(prev!=null){
                prev.left = null;
                prev.right = node;
            }
            if(node.right != null){
                stk.push(node.right);
            }
            if(node.left != null){
                stk.push(node.left);
            }
            prev = node;
        }
    }
}